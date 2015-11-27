package rplsd.mididsl.model;

import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.SysexMessage;
import javax.sound.midi.Track;

public class Channel {
	public static final int BASE_TEMPO = 120;
	
	private int instrument;
	private int length, octave, volume, shift, tempo; // tempo in bpm, 1 beat = 1/4 note
	private ArrayList<MidiMessage> messages;
	private long ticks;
	private String name;
	
	public Channel(String name, int instrument){
		this.instrument = instrument;
		messages = new ArrayList<>();
		
		// default value
		tempo = BASE_TEMPO; length = 4; octave = 5; volume = 64; shift = 0; ticks = 32; // starting pause 64 ticks
		this.name = name;
	}
	
	public Track generateTrack(Sequence seq) throws InvalidMidiDataException{
		Track track = seq.createTrack();
		
		// turn on General MIDI sound set
		byte[] b = {(byte) 0xF0, 0x7E, 0x7F, 0x09, 0x01, (byte) 0xF7};
		SysexMessage sm = new SysexMessage();
		sm.setMessage(b, b.length);
		MidiEvent me = new MidiEvent(sm,(long)0);
		track.add(me);
		
		// set track name
		MetaMessage mt = new MetaMessage();
		String TrackName = name.substring(1);
		mt.setMessage(0x03 ,TrackName.getBytes(), TrackName.length());
		me = new MidiEvent(mt,(long)0);
		track.add(me);
		
		
		
		// set instrument TODO not yet
		ShortMessage mm = new ShortMessage();
		mm.setMessage(0xC0, 0x00, 0x00);
		me = new MidiEvent(mm,(long)0);
		track.add(me);
		
		// set base tempo (120 bpm)
		mt = new MetaMessage();
        byte[] bt = {(byte)0x07, (byte)0xA1, (byte)0x20};
		mt.setMessage(0x51 ,bt, bt.length);
		me = new MidiEvent(mt,(long)0);
		
				
		for (MidiMessage message : messages){
			message.processMessage(track);
		}
		
		// set end of track
		mt = new MetaMessage();
	    byte[] bet = {}; // empty array
		mt.setMessage(0x2F,bet,0);
		me = new MidiEvent(mt, ticks + Note.PPQ);
		track.add(me);
		
		return track;
	}
	
	public void addMessage(MidiMessage msg){
		messages.add(msg);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for (MidiMessage n : messages){
			sb.append(n).append('\n');
		}
		
		return sb.append('\n').toString();
	}
	
	public ArrayList<MidiMessage> getCommands(){
		return messages;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getOctave() {
		return octave;
	}

	public void setOctave(int octave) {
		this.octave = octave;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getInstrument() {
		return instrument;
	}

	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public long getTicks() {
		return ticks;
	}

	public void setTicks(long ticks) {
		this.ticks = ticks;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
}
