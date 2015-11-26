package rplsd.mididsl.model;

public abstract class Modifier implements Command{
	protected int value;
	public abstract void modifyChannel (Channel channel);
	
	@Override
	public void processChannel(Channel channel){
		modifyChannel(channel);
	}
	
	public static class Tempo extends Modifier{
		public Tempo (int value){
			this.value = value;
		}
		
		@Override
		public void modifyChannel(Channel channel) {
			channel.setTempo(value);
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
	}
	
	public static class Octave extends Modifier{
		public Octave (int value){
			this.value = value;
		}
		
		@Override
		public void modifyChannel(Channel channel) {
			channel.setOctave(value);
		}
	}
	
	public static class Volume extends Modifier{
		public Volume (int value){
			this.value = value;
		}
		
		@Override
		public void modifyChannel(Channel channel) {
			channel.setVolume(value);
		}
	}
	
	public static class OctaveUp extends Modifier{		
		@Override
		public void modifyChannel(Channel channel) {
			channel.setOctave(channel.getOctave() + 1);
		}
	}
	
	public static class OctaveDown extends Modifier{		
		@Override
		public void modifyChannel(Channel channel) {
			channel.setOctave(channel.getOctave() - 1);
		}
	}
	
	public static class PitchTranspose extends Modifier{
		public PitchTranspose (int value){
			this.value = value;
		}
		
		@Override
		public void modifyChannel(Channel channel) {
			channel.setShift(value);
		}
	}
}
