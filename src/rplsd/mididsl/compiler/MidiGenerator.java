package rplsd.mididsl.compiler;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

import rplsd.mididsl.model.MidiObject;

public class MidiGenerator {
	MidiObject midi; Sequence seq;
	public MidiGenerator(MidiObject midi) throws InvalidMidiDataException{
		this.midi = midi;
		seq = midi.generateMidiSequence();
	}
	
	public void play() throws MidiUnavailableException, InvalidMidiDataException {
		Sequencer sqr = MidiSystem.getSequencer();
		if (sqr == null) return;
		sqr.open();
		sqr.setSequence(seq);
		
		sqr.start();
		while(sqr.isRunning()){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
		sqr.close();
	}
	
	public void write(File out) throws IOException{
		MidiSystem.write(seq, 1, out);
	}
}
