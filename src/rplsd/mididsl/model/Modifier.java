package rplsd.mididsl.model;

public abstract class Modifier implements Command{
	protected int value;
	public abstract void modifyChannel (Channel channel);
	
	@Override
	public void processChannel(Channel channel){
		modifyChannel(channel);
	}
	
	public static class Tempo extends Modifier {
		public Tempo (int value){
			this.value = value;
		}
		
		@Override
		public void modifyChannel(Channel channel) {
			channel.setTempo(value);
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
		public void modifyChannel(Channel channel) {
			channel.setLength(value);
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
		public void modifyChannel(Channel channel) {
			if (increase){
				channel.setOctave(channel.getOctave() + value);
			} else {
				channel.setOctave(value);
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
		public void modifyChannel(Channel channel) {
			if (increase){
				channel.setVolume(channel.getVolume() + value);
			} else {
				channel.setVolume(value);
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
		public void modifyChannel(Channel channel) {
			if (increase){
				channel.setShift(channel.getShift() + value);
			} else {
				channel.setShift(value);
			}
		}
		
		@Override
		public Command duplicate() {
			return new PitchTranspose(value, increase);
		}
	}
}
