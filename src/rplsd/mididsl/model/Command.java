package rplsd.mididsl.model;

public interface Command {
	public void processTrack(TrackObject channel);
	public Command duplicate();
}
