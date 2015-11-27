package rplsd.mididsl.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Sequence;

public class MidiObject {
	private HashMap<String, TrackObject> tracks;
	private HashMap<String, Playback.Section> groups;
	
	public MidiObject(){
		tracks = new HashMap<>();
		groups = new HashMap<>();
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
		tracks.put(name, new TrackObject(name, instrument, percussion));
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
