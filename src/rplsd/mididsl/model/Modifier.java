package rplsd.mididsl.model;

public abstract class Modifier implements Command{
	protected int value;
	public abstract void modifyTrack (TrackObject track);
	
	@Override
	public void processTrack(TrackObject track){
		modifyTrack(track);
	}
	
	public static class Tempo extends Modifier {
		public Tempo (int value){
			this.value = value;
		}
		
		@Override
		public void modifyTrack(TrackObject track) {
			track.setTempo(value);
		}

		@Override
		public Command duplicate() {
			return new Tempo(value);
		}
	}
	
	public static class Length extends Modifier{
		public Length (int value){
			this.value = value;
		}
		
		@Override
		public void modifyTrack(TrackObject track) {
			track.setLength(value);
		}
		
		@Override
		public Command duplicate() {
			return new Length(value);
		}
	}
	
	public static class Octave extends Modifier{
		private boolean increase;
		public static int DEFAULT_INCREASE = 1;
		
		public Octave (int value, boolean increase){
			this.increase = increase;
			this.value = value;
		}
		
		@Override
		public void modifyTrack(TrackObject track) {
			if (increase){
				track.setOctave(track.getOctave() + value);
			} else {
				track.setOctave(value);
			}
			
		}
		
		@Override
		public Command duplicate() {
			return new Octave(value, increase);
		}
	}
	
	public static class Volume extends Modifier{
		private boolean increase;
		public static int DEFAULT_INCREASE = 1;
		
		public Volume (int value, boolean increase){
			this.increase = increase;
			this.value = value;
		}
		
		@Override
		public void modifyTrack(TrackObject track) {
			if (increase){
				track.setVolume(track.getVolume() + value);
			} else {
				track.setVolume(value);
			}
		}
		
		@Override
		public Command duplicate() {
			return new Volume(value, increase);
		}
	}
	
	public static class PitchTranspose extends Modifier{
		private boolean increase;
		public static int DEFAULT_INCREASE = 1;
		
		public PitchTranspose (int value, boolean increase){
			this.increase = increase;
			this.value = value;
		}
		@Override
		public void modifyTrack(TrackObject track) {
			if (increase){
				track.setShift(track.getShift() + value);
			} else {
				track.setShift(value);
			}
		}
		
		@Override
		public Command duplicate() {
			return new PitchTranspose(value, increase);
		}
	}
}
