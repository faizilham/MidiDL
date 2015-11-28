package rplsd.mididsl.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.management.RuntimeErrorException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Sequence;

public class MidiObject {
	private HashMap<String, TrackObject> tracks;
	private HashMap<String, Playback.Section> groups;
	private HashMap<String, Integer> constants;
	public static final int PERCUSSION_CHANNEL = 9; 
	int[] instruments;
	
	public MidiObject(){
		tracks = new HashMap<>();
		groups = new HashMap<>();
		constants = new HashMap<>();
		
		instruments = new int[16];
		for (int i = 0; i < 16; ++i) instruments[i] = -1;
		instruments[PERCUSSION_CHANNEL] = 9999; // reserved for percussion
	}
	
	public Sequence generateMidiSequence() throws InvalidMidiDataException{
		Sequence seq = new Sequence(javax.sound.midi.Sequence.PPQ, Note.PPQ);
		
		Iterator <Entry<String, TrackObject>> it = tracks.entrySet().iterator();
				
		while (it.hasNext()){
			TrackObject track = it.next().getValue();
			track.generateTrack(seq);
		}
		
		return seq;
	}
	
	public Integer getConstant(String name){
		return constants.get(name);
	}
	
	public void addConstant(String name, int value){
		constants.put(name, value);
	}
	
	public Playback.Section getGroup(String groupName){
		return groups.get(groupName);
	}
	
	public void addGroup(String groupName, Playback.Section group){
		groups.put(groupName, group);
	}
	
	public TrackObject getTrack(String name){
		return tracks.get(name);
	}
	
	public void addTrack(String name, int instrument, boolean percussion){
		int channel = -1;
		if (percussion){
			channel = PERCUSSION_CHANNEL;
			instrument = 9999;
		} else {
			for (int i = 0; i < instruments.length; ++i){
				if (instruments[i] == -1){
					instruments[i] = instrument;
					channel = i; break;
				} else if (instruments[i] == instrument){
					channel = i; break;
				}
			}
			
			if (channel == -1) throw new RuntimeErrorException(new Error("Maximum 15 instrument and a percussion reached"));
		}
		
		tracks.put(name, new TrackObject(name, instrument, channel));
	}
	
	public String toString(){
		Iterator <Entry<String, TrackObject>> it = tracks.entrySet().iterator();
		Iterator <Entry<String, Playback.Section>> itg = groups.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		
		while(itg.hasNext()) {
			Entry<String, Playback.Section> e = itg.next();
			sb.append("group ").append(e.getKey()).append('\n').append(e.getValue()).append('\n');
		}
		
		while (it.hasNext()){
			Entry<String, TrackObject> e = it.next();
			sb.append("track ").append(e.getKey()).append('\n').append(e.getValue());
		}
		
		return sb.toString();
	}
}
