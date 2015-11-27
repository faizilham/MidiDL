package rplsd.mididsl.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MidiObject {
	private HashMap<String, Channel> channels;
	private HashMap<String, Playback.Group> groups;
	
	public MidiObject(){
		channels = new HashMap<>();
		groups = new HashMap<>();
	}
	
	public Playback.Group getGroup(String groupName){
		return groups.get(groupName);
	}
	
	public void addGroup(String groupName, Playback.Group group){
		groups.put(groupName, group);
	}
	
	public Channel getChannel(String channelName){
		return channels.get(channelName);
	}
	
	public void addChannel(String channelName, int instrument){
		channels.put(channelName, new Channel(instrument));
	}
	
	public String toString(){
		Iterator <Entry<String, Channel>> it = channels.entrySet().iterator();
		Iterator <Entry<String, Playback.Group>> itg = groups.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		
		while(itg.hasNext()) {
			Entry<String, Playback.Group> e = itg.next();
			sb.append("group ").append(e.getKey()).append('\n').append(e.getValue());
		}
		
		while (it.hasNext()){
			Entry<String, Channel> e = it.next();
			sb.append("channel ").append(e.getKey()).append('\n').append(e.getValue());
		}
		
		return sb.toString();
	}
}
