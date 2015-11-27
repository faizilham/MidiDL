package rplsd.mididsl.model;

import javax.sound.midi.Track;

public interface MidiMessage {
	public void processMessage(Track track);
}
