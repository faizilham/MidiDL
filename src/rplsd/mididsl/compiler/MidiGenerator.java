package rplsd.mididsl.compiler;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

import rplsd.mididsl.model.MidiObject;

public class MidiGenerator {
	MidiObject midi;
	public MidiGenerator(MidiObject midi){
		this.midi = midi;
	}
	
	public void generate() throws Exception{
		Sequence seq = midi.generateMidiSequence();
		
		Sequencer sqr = MidiSystem.getSequencer();
		if (sqr == null) return;
		sqr.open();
		sqr.setSequence(seq);
		System.out.println("start");
		long time = System.currentTimeMillis();
		sqr.start();
		
		while(sqr.isRunning()){
			Thread.sleep(100);
		}
		
		time = System.currentTimeMillis() - time;
		System.out.println(time);
		
		sqr.close();
	}
}
