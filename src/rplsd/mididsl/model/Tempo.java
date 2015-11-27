package rplsd.mididsl.model;

import java.nio.ByteBuffer;

import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.Track;

public class Tempo extends Modifier implements MidiMessage {
	private int value;
	private static final int MICROSEC = 1000000;
	
	public Tempo (int value){
		this.value = value;
	}
	
	@Override
	public void modifyChannel(Channel channel) {
		//channel.setTempo(value);
		channel.addMessage(this);
	}

	@Override
	public Command duplicate() {
		return new Tempo(value);
	}
	
	@Override
	public void processMessage(Track track) {
		try {
			int microPerBeat = 60 * MICROSEC / value;
			
			
			//set tempo
			MetaMessage mt = new MetaMessage();
			ByteBuffer buf = ByteBuffer.allocate(4);			
			buf.putInt(microPerBeat);
			
			
			
	        byte[] bt = buf.array();
			mt.setMessage(0x51 ,bt, bt.length);
			
			MidiEvent me = new MidiEvent(mt,0);
			track.add(me);
		} catch (Exception e){
			e.printStackTrace();
		}		
	}

}
