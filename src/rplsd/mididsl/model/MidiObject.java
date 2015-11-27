package rplsd.mididsl.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Sequence;

public class MidiObject {
	private HashMap<String, Channel> channels;
	private HashMap<String, Playback.Section> groups;
	
	public MidiObject(){
		channels = new HashMap<>();
		groups = new HashMap<>();
	}
	
	public Sequence generateMidiSequence() throws InvalidMidiDataException{
		Sequence seq = new Sequence(javax.sound.midi.Sequence.PPQ, Note.PPQ);
		
		Iterator <Entry<String, Channel>> it = channels.entrySet().iterator();
		
		
		while (it.hasNext()){
			Channel channel = it.next().getValue();
			channel.generateTrack(seq);
		}
		
		return seq;
	}
	
	public Playback.Section getGroup(String groupName){
		return groups.get(groupName);
	}
	
	public void addGroup(String groupName, Playback.Section group){
		groups.put(groupName, group);
	}
	
	public Channel getChannel(String channelName){
		return channels.get(channelName);
	}
	
	public void addChannel(String channelName, int instrument){
		channels.put(channelName, new Channel(channelName, instrument));
	}
	
	public String toString(){
		Iterator <Entry<String, Channel>> it = channels.entrySet().iterator();
		Iterator <Entry<String, Playback.Section>> itg = groups.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		
		while(itg.hasNext()) {
			Entry<String, Playback.Section> e = itg.next();
			sb.append("group ").append(e.getKey()).append('\n').append(e.getValue()).append('\n');
		}
		
		while (it.hasNext()){
			Entry<String, Channel> e = it.next();
			sb.append("channel ").append(e.getKey()).append('\n').append(e.getValue());
		}
		
		return sb.toString();
	}
}
