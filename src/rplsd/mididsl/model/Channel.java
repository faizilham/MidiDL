package rplsd.mididsl.model;

import java.util.ArrayList;

public class Channel {
	private int instrument;
	private int tempo, length, octave, volume, shift; // tempo in bpm, 1 beat = 1/4 note
	private ArrayList<Note> notes;
	private long ticks;
	
	public Channel(int instrument){
		this.instrument = instrument;
		notes = new ArrayList<>();
		
		// default value
		tempo = 120; length = 4; octave = 5; volume = 100; shift = 0; ticks = 0;
		
	}
	
	public void addNote(Note note){
		notes.add(note);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for (Note n : notes){
			sb.append(n).append('\n');
		}
		
		return sb.append('\n').toString();
	}
	
	public ArrayList<Note> getCommands(){
		return notes;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
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
	
}
