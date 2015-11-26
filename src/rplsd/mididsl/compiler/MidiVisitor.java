package rplsd.mididsl.compiler;

import org.antlr.v4.runtime.misc.NotNull;

import rplsd.mididsl.model.Channel;
import rplsd.mididsl.model.Command;
import rplsd.mididsl.model.MidiObject;
import rplsd.mididsl.model.Modifier;
import rplsd.mididsl.model.Note;
import rplsd.mididsl.model.Playback;

public class MidiVisitor extends MdlBaseVisitor<Object> {
	
	private MidiObject midi;
	private static final char FLAT_NOTE = '-';
	
	@Override public MidiObject visitMidi(@NotNull MdlParser.MidiContext ctx) {
		midi = new MidiObject();
		visitChildren(ctx);
		return midi; 
	}
	
	@Override public Object visitChannel_declaration(@NotNull MdlParser.Channel_declarationContext ctx) {
		String channelName = ctx.name.getText();
		int instrument = Integer.parseInt(ctx.instrument.getText());
		midi.addChannel(channelName, instrument);		
		return visitChildren(ctx); 
	}
	
	@Override public Object visitChannel(@NotNull MdlParser.ChannelContext ctx) {
		Channel currentChannel = midi.getChannel(ctx.channel_name.getText());
		
		if (currentChannel != null) {
			for (MdlParser.CommandContext child : ctx.command()){
				Command command = (Command) visit(child);
				if (command != null) command.processChannel(currentChannel);
			}
		} else {
			System.err.println("Can't found channel " + ctx.channel_name.getText());
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
			if (pitchShiftStr.charAt(0) == FLAT_NOTE){
				
				pitchShift = -pitchShift;
				
			}
		}
		
		int octaveShift = 0;
		if (ctx.octave_shift != null){
			octaveShift = ctx.octave_shift.getText().length();
		}
		
		String lenStr = ctx.note_length == null ? null : ctx.note_length.getText();
		int length = (lenStr == null) ? 0 : Integer.parseInt(lenStr); 
		
		// build object
		return new Note (baseNote, pitchShift, octaveShift, length); 
	}
	
	/*** Playback Object ***/
	
	@Override public Object visitHarmony(@NotNull MdlParser.HarmonyContext ctx){
		//return visitChildren(ctx);
		Playback.Harmony harmony = new Playback.Harmony();
		for (MdlParser.NoteContext notectx : ctx.note()){
			Note note = (Note) visit(notectx);
			harmony.addNote(note);
		}
		
		return harmony;
	}
	
	@Override public Object visitLoop(@NotNull MdlParser.LoopContext ctx){
		//return visitChildren(ctx);
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
	
	@Override public Modifier visitOctave(@NotNull MdlParser.OctaveContext ctx) {
		int value = Integer.parseInt(ctx.value.getText());
		
		return new Modifier.Octave(value); 
	}
	
	@Override public Modifier visitVolume(@NotNull MdlParser.VolumeContext ctx) {
		int value = Integer.parseInt(ctx.value.getText());
		
		return new Modifier.Volume(value); 
	}
	
	@Override public Modifier visitOctave_up(@NotNull MdlParser.Octave_upContext ctx) {
		return new Modifier.OctaveUp();
	}
	
	@Override public Modifier visitOctave_down(@NotNull MdlParser.Octave_downContext ctx) {
		return new Modifier.OctaveDown();
	}
	
	@Override public Modifier visitPitch_transpose(@NotNull MdlParser.Pitch_transposeContext ctx) {
		int value = Integer.parseInt(ctx.value.getText());
		
		if (ctx.negative != null) value = -value;
		
		return new Modifier.PitchTranspose(value); 
	}
}
