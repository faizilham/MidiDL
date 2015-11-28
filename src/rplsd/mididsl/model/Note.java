package rplsd.mididsl.model;

import javax.management.RuntimeErrorException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class Note implements Command, MidiMessage{
	
	public static int PPQ = 128; 
	
	private static int getBaseNoteNumber(String noteStr){
		char noteCode = noteStr.toUpperCase().charAt(0);
		switch(noteCode){
			case 'C': return 0; 
			case 'D': return 2; 
			case 'E': return 4; 
			case 'F': return 5; 
			case 'G': return 7; 
			case 'A': return 9; 
			case 'B': return 11; 
			default: return -1; 
		}
	}
	private int midinote;
	private long startTick, endTick; // in millisecond
	private int volume;
	private int length;
	private int lengthMultiplier, lengthDivider;
	private int octaveShift;
	private boolean tickSet;
	private boolean rest;
	private int channel;
	
	private Note(){}
	
	private static int exp2(int n){
		return 1 << n;
	}
	
	public Note (String noteStr, int pitchShift, int octaveShift, int length, int halfLength){
		int basenum = getBaseNoteNumber(noteStr);
		
		if (basenum == -1){
			midinote = -1;
			rest = true;
		} else {
			midinote = basenum + pitchShift;
			rest = false;
		}
		this.octaveShift = octaveShift; 
		
		this.length = length;
		tickSet = false;
		
		int lengthModifier = 1 + halfLength;
		
		lengthMultiplier = (exp2(lengthModifier) - 1);
		lengthDivider = exp2(lengthModifier-1);
	}
		
	public void setup (int trackPitchTranspose, int currentOctave, int volume, int defaultLength, long startTick, int tempo, int channel){
		this.startTick = startTick;
		
		if (length == 0) length = defaultLength;
		
		if (rest){
			this.volume = 0;
		} else {
			this.volume = volume;
			int octave = currentOctave + octaveShift;
			midinote += trackPitchTranspose + 12*octave;
		}
		
		// tempo in bpm, 1 beat = 1/4 note
		long tickLength = 4 * PPQ * TrackObject.BASE_TEMPO * lengthMultiplier / (length * lengthDivider * tempo);
		
		endTick = startTick + tickLength;
		tickSet = true;
		this.channel = channel;
	}
	
	@Override
	public Note duplicate(){
		Note note = new Note();
		
		note.midinote = midinote;
		note.startTick = startTick; note.endTick = endTick;
		note.volume = volume; note.length = length;
		note.lengthMultiplier = lengthMultiplier; note.lengthDivider = lengthDivider;
		note.octaveShift = octaveShift; note.tickSet = tickSet; note.rest = rest; note.channel = channel;
		return note;
	}
	
	public static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }
	
	public void join(Note note){
		if (!tickSet || !note.tickSet) throw new RuntimeErrorException(new Error("Note not yet set"));
		if (note.midinote != note.midinote) throw new RuntimeErrorException(new Error("Different note can't be joined"));
		
		length = length * lengthDivider; lengthDivider = 1;
		int notelen = note.length * note.lengthDivider;
		endTick = note.endTick;
		
		lengthMultiplier = lengthMultiplier * notelen + note.lengthMultiplier*length;
		length = length * notelen;
		
		int gcd = GCD (lengthMultiplier, length);
		lengthMultiplier /= gcd; length /= gcd;
	}
	
	@Override
	public void processTrack(TrackObject track) {
		if (!isTickSet()){
			setup(track.getShift(), track.getOctave(), track.getVolume(), track.getLength(), track.getTicks(), track.getTempo(), track.getChannel());
		}
		
		track.addMessage(this);
		track.setTicks(endTick);
	}
	
	@Override
	public void processMessage(Track miditrack) {
		if (rest) return;
		
		try {
			// note on
			byte channel = (byte) this.channel;
			ShortMessage mm = new ShortMessage();
			mm.setMessage((byte) (0x90 + channel), midinote, volume);
			MidiEvent me = new MidiEvent(mm,(long) startTick);
			miditrack.add(me);

			// note off
			mm = new ShortMessage();
			mm.setMessage((byte) (0x80 + channel), midinote, volume);
			me = new MidiEvent(mm,(long) endTick);
			miditrack.add(me);
		} catch (Exception e){
			e.printStackTrace();
		}		
	}
	
	public String toString(){
		return String.format("(%d, %d-%d %d/%d, %d)", midinote, startTick, endTick, lengthMultiplier, length*lengthDivider, volume);
	}
	
	public boolean isTickSet(){
		return tickSet;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public long getStartTick() {
		return startTick;
	}

	public long getEndTick() {
		return endTick;
	}
	
	public int getOctaveShift(){
		return octaveShift;
	}

	public int getMidinote() {
		return midinote;
	}

	public boolean isRest() {
		return rest;
	}
}

