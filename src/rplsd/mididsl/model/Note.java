package rplsd.mididsl.model;

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
		
	public void setup (int channelPitchTranspose, int currentOctave, int volume, int defaultLength, long startTick){
		this.startTick = startTick;
		
		if (length == 0) length = defaultLength;
		
		if (rest){
			this.volume = 0;
		} else {
			this.volume = volume;
			int octave = currentOctave + octaveShift;
			midinote += channelPitchTranspose + 12*octave;
		}
		
		// tempo in bpm, 1 beat = 1/4 note
		long tickLength = 4 * PPQ * lengthMultiplier / (length * lengthDivider);
		
		endTick = startTick + tickLength;
		tickSet = true;
	}
	
	@Override
	public Note duplicate(){
		Note note = new Note();
		
		note.midinote = midinote;
		note.startTick = startTick; note.endTick = endTick;
		note.volume = volume; note.length = length;
		note.lengthMultiplier = lengthMultiplier; note.lengthDivider = lengthDivider;
		note.octaveShift = octaveShift; note.tickSet = tickSet; note.rest = rest;
		return note;
	}
	
	@Override
	public void processChannel(Channel channel) {
		if (!isTickSet()){
			setup(channel.getShift(), channel.getOctave(), channel.getVolume(), channel.getLength(), channel.getTicks());
		}
		
		channel.addMessage(this);
		channel.setTicks(endTick);
	}
	
	@Override
	public void processMessage(Track track) {
		if (rest) return;
		
		try {
			// note on
			ShortMessage mm = new ShortMessage();
			mm.setMessage(0x90, midinote, volume);
			MidiEvent me = new MidiEvent(mm,(long) startTick);
			track.add(me);

			// note off
			mm = new ShortMessage();
			mm.setMessage(0x80, midinote, volume);
			me = new MidiEvent(mm,(long) endTick);
			track.add(me);
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

	public int getMidinote() {
		return midinote;
	}

	public boolean isRest() {
		return rest;
	}
}

