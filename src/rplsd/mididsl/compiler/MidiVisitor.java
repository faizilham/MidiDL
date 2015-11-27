package rplsd.mididsl.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import rplsd.mididsl.compiler.MdlParser.Shift_signContext;
import rplsd.mididsl.model.Channel;
import rplsd.mididsl.model.Command;
import rplsd.mididsl.model.MidiObject;
import rplsd.mididsl.model.Modifier;
import rplsd.mididsl.model.Note;
import rplsd.mididsl.model.Playback;

public class MidiVisitor extends MdlBaseVisitor<Object> {
	
	private MidiObject midi = null;
	private static final char FLAT_NOTE = '-';
	private static final char DEC_SIGN = '<';
	
	@Override public MidiObject visitMidi(@NotNull MdlParser.MidiContext ctx) {
		if (midi == null)
			midi = new MidiObject();
		visitChildren(ctx);
		return midi; 
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
	
	@Override public Object visitChannel_declaration(@NotNull MdlParser.Channel_declarationContext ctx) {
		String channelName = ctx.name.getText();
		int instrument = Integer.parseInt(ctx.instrument.getText());
		midi.addChannel(channelName, instrument);		
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
	
	@Override public Object visitChannel(@NotNull MdlParser.ChannelContext ctx) {
		Channel currentChannel = midi.getChannel(ctx.channel_name.getText());
		
		if (currentChannel == null) {
			throw new RuntimeErrorException(new Error("Can't found channel " + ctx.channel_name.getText()));
		}
		
		for (MdlParser.CommandContext child : ctx.command()){
			Command command = (Command) visit(child);
			if (command != null) command.processChannel(currentChannel);
		}
		
		return currentChannel;
	}
	
	@Override public Note visitNote(@NotNull MdlParser.NoteContext ctx) {
		// get channel default
		
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
		int length = (lenStr == null) ? 0 : Integer.parseInt(lenStr);
		
		int halfLength = 0;
		if (ctx.length_shift != null){
			halfLength = ctx.length_shift.getText().length();
		}
		
		// build object
		return new Note (baseNote, pitchShift, octaveShift, length, halfLength); 
	}
	
	/*** Playback Object ***/
	
	@Override public Object visitHarmony(@NotNull MdlParser.HarmonyContext ctx){
		Playback.Harmony harmony = new Playback.Harmony();
		for (MdlParser.NoteContext notectx : ctx.note()){
			Note note = (Note) visit(notectx);
			harmony.addNote(note);
		}
		
		return harmony;
	}
	
	@Override public Object visitLoop(@NotNull MdlParser.LoopContext ctx){
		int n = Integer.parseInt(ctx.value.getText());
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
		String groupName = ctx.name.getText();
		Playback.Section group = midi.getGroup(groupName);
		
		if (group == null) {
			throw new RuntimeErrorException(new Error("Can't found group " + groupName));
		}
		
		return group;
	}
	
	@Override public Object visitTie(@NotNull MdlParser.TieContext ctx){
		//return visitChildren(ctx);
		return null;
	}
	
	/*** Modifiers Object ***/
	@Override public Modifier visitTempo(@NotNull MdlParser.TempoContext ctx) {
		int value = Integer.parseInt(ctx.value.getText());
		
		return new Modifier.Tempo(value); 
	}
	
	@Override public Modifier visitLength(@NotNull MdlParser.LengthContext ctx) {
		int value = Integer.parseInt(ctx.value.getText());
		
		return new Modifier.Length(value); 
	}
	
	private int[] readIncrease(Token value, Shift_signContext shift, int defaultIncrease){
		int val; int increase;
				
		if (shift == null){ // set modifier
			val = Integer.parseInt(value.getText());
			increase = 0;
		} else { // increase modifier
			val = (value == null) ? defaultIncrease : Integer.parseInt(value.getText());
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
