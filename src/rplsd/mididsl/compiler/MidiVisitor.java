package rplsd.mididsl.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import rplsd.mididsl.compiler.MdlParser.Shift_signContext;
import rplsd.mididsl.compiler.MdlParser.ValContext;
import rplsd.mididsl.model.Command;
import rplsd.mididsl.model.MidiObject;
import rplsd.mididsl.model.Modifier;
import rplsd.mididsl.model.Note;
import rplsd.mididsl.model.Playback;
import rplsd.mididsl.model.TrackObject;

public class MidiVisitor extends MdlBaseVisitor<Object> {
	
	private MidiObject midi = null;
	private static final char FLAT_NOTE = '-';
	private static final char DEC_SIGN = '<';
	private static final char CONSTANT_SIGN = '$';
	
	
	@Override public MidiObject visitMidi(@NotNull MdlParser.MidiContext ctx) {
		if (midi == null)
			midi = new MidiObject();
		visitChildren(ctx);
		return midi; 
	}
	
	private int parseNum(String token){
		if (token.charAt(0) != CONSTANT_SIGN){
			return Integer.parseInt(token);
		} else {
			Integer i = midi.getConstant(token);
			if (i == null){
				throw new RuntimeErrorException(new Error("Can't found constant " + token));
			} else {
				return i;
			}
		}
	}
	
	@Override public Object visitInclude(@NotNull MdlParser.IncludeContext ctx) {
		String filename = ctx.filename.getText();
		filename = filename.substring(1, filename.length() - 1);
		
		try {
			MdlReader reader = new MdlReader();
			ParseTree tree = reader.parse(new FileInputStream(new File(filename)));
			visit(tree);
		} catch (IOException e) {
			throw new RuntimeErrorException(new Error("File not found: " + filename));
		}
		
		return null;
	}
	
	@Override public Object visitConstant_declaration(@NotNull MdlParser.Constant_declarationContext ctx) {
		String name = ctx.name.getText();
		int value = parseNum(ctx.value.getText());
		midi.addConstant(name, value);
		return visitChildren(ctx); 
	}
	
	@Override public Object visitTrack_declaration(@NotNull MdlParser.Track_declarationContext ctx) {
		String name = ctx.name.getText();
		int instrument = parseNum(ctx.instrument.getText());
		midi.addTrack(name, instrument, false);		
		return visitChildren(ctx); 
	}
	
	@Override public Object visitPercussion_declaration(@NotNull MdlParser.Percussion_declarationContext ctx) {
		String name = ctx.name.getText();
		midi.addTrack(name, 0, true);
		return visitChildren(ctx); 
	}
	
	@Override public Playback.Section visitSection_declaration(@NotNull MdlParser.Section_declarationContext ctx) {
		String groupName = ctx.name.getText();
		Playback.Section group = new Playback.Section();
		
		for (MdlParser.CommandContext child: ctx.command()){
			Command command = (Command) visit(child);
			if (command != null) group.addCommand(command);
		}
		
		midi.addGroup(groupName, group);
		return group;
	}
	
	@Override public Object visitTrack(@NotNull MdlParser.TrackContext ctx) {
		TrackObject track = midi.getTrack(ctx.track_name.getText());
		
		if (track == null) {
			throw new RuntimeErrorException(new Error("Can't found track " + ctx.track_name.getText()));
		}
		
		for (MdlParser.CommandContext child : ctx.command()){
			Command command = (Command) visit(child);
			if (command != null) command.processTrack(track);
		}
		
		return track;
	}
	
	@Override public Note visitNote(@NotNull MdlParser.NoteContext ctx) {
		// read token
		String baseNote = ctx.base.getText();
		
		int pitchShift = 0; String pitchShiftStr;
		if ((ctx.pitch_shift != null) && ((pitchShiftStr = ctx.pitch_shift.getText()) != null)){
			pitchShift = pitchShiftStr.length();
			if (pitchShiftStr.charAt(0) == FLAT_NOTE) pitchShift = -pitchShift;
		}
		
		int octaveShift = 0;
		if (ctx.octave_shift != null){
			octaveShift = ctx.octave_shift.getText().length();
		}
		
		String lenStr = ctx.note_length == null ? null : ctx.note_length.getText();
		int length = (lenStr == null) ? 0 : parseNum(lenStr);
		
		int halfLength = 0;
		if (ctx.length_shift != null){
			halfLength = ctx.length_shift.getText().length();
		}
		
		// build object
		return new Note (baseNote, pitchShift, octaveShift, length, halfLength); 
	}
	
	/*** Playback Object ***/
	
	@Override public Object visitTie(@NotNull MdlParser.TieContext ctx) {
		Playback.Tie tie = new Playback.Tie();
		Note first = null;
		
		for (MdlParser.NoteContext notectx : ctx.notes){
			Note note = (Note) visit(notectx);
			
			if (first == null){
				first = note;
			} else {
				if ((first.getMidinote() != note.getMidinote()) || (first.getOctaveShift() != note.getOctaveShift())){
					throw new RuntimeErrorException(new Error("Tie can only connect same-pitched notes"));
				}
			}
			
			tie.addNote(note);
		}
		
		return tie;
	}
	
	@Override public Object visitHarmony(@NotNull MdlParser.HarmonyContext ctx){
		Playback.Harmony harmony = new Playback.Harmony();
		
		for (MdlParser.NoteContext notectx : ctx.note()){
			Note note = (Note) visit(notectx);	
			harmony.addNote(note);
		}
		
		return harmony;
	}
	
	@Override public Object visitLoop(@NotNull MdlParser.LoopContext ctx){
		int n = parseNum(ctx.value.getText());
		Playback.Loop loop = new Playback.Loop();
		
		for (int i = 0; i < n; ++i){
			for (MdlParser.CommandContext child: ctx.command()){
				Command command = (Command) visit(child);
				if (command != null) loop.addCommand(command);
			}
		}
		
		return loop;
	}
	
	@Override public Object visitSection(@NotNull MdlParser.SectionContext ctx){
		String name = ctx.name.getText();
		Playback.Section section = midi.getGroup(name);
		
		if (section == null) {
			throw new RuntimeErrorException(new Error("Can't found group " + name));
		}
		
		return section;
	}
	
	/*** Modifiers Object ***/
	@Override public Modifier visitTempo(@NotNull MdlParser.TempoContext ctx) {
		int value = parseNum(ctx.value.getText());
		
		return new Modifier.Tempo(value); 
	}
	
	@Override public Modifier visitLength(@NotNull MdlParser.LengthContext ctx) {
		int value = parseNum(ctx.value.getText());
		
		return new Modifier.Length(value); 
	}
	
	private int[] readIncrease(ValContext value, Shift_signContext shift, int defaultIncrease){
		int val; int increase;
				
		if (shift == null){ // set modifier
			val = parseNum(value.getText());
			increase = 0;
		} else { // increase modifier
			val = (value == null) ? defaultIncrease : parseNum(value.getText());
			increase = 1;
			if (shift.getText().charAt(0) == DEC_SIGN) val = -val;
		}
		
		return new int[]{val, increase};
	}
	
	@Override public Modifier visitOctave(@NotNull MdlParser.OctaveContext ctx) {
		int[] result = readIncrease(ctx.value, ctx.shift, Modifier.Octave.DEFAULT_INCREASE);
		return new Modifier.Octave(result[0], result[1] != 0); 
	}
	
	@Override public Modifier visitVolume(@NotNull MdlParser.VolumeContext ctx) {
		int[] result = readIncrease(ctx.value, ctx.shift, Modifier.Volume.DEFAULT_INCREASE);
		return new Modifier.Volume(result[0], result[1] != 0); 
	}
	
	@Override public Modifier visitPitch_transpose(@NotNull MdlParser.Pitch_transposeContext ctx) {
		int[] result = readIncrease(ctx.value, ctx.shift, Modifier.PitchTranspose.DEFAULT_INCREASE);
		return new Modifier.PitchTranspose(result[0], result[1] != 0);  
	}
}
