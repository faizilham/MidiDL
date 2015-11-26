package rplsd.mididsl.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MidiObject {
	private HashMap<String, Channel> channels;
	public MidiObject(){
		channels = new HashMap<>();
	}
	
	public Channel getChannel(String channelName){
		return channels.get(channelName);
	}
	
	public void addChannel(String channelName, int instrument){
		channels.put(channelName, new Channel(instrument));
	}
	
	public String toString(){
		Iterator <Entry<String, Channel>> it = channels.entrySet().iterator();
		StringBuilder sb = new StringBuilder();
		
		while (it.hasNext()){
			Entry<String, Channel> e = it.next();
			sb.append("channel ").append(e.getKey()).append('\n').append(e.getValue());
		}
		
		return sb.toString();
	}
}
