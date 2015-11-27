package rplsd.mididsl.model;

import java.util.ArrayList;

public abstract class Playback implements Command{
	public abstract void modifyChannel (Channel channel);
	
	@Override
	public void processChannel(Channel channel){
		modifyChannel(channel);
	}
	
	public static class Harmony extends Playback{
		private ArrayList<Note> notes;
		public Harmony(){
			notes = new ArrayList<>();
		}
		
		public void addNote(Note note){
			notes.add(note);
		}
		
		@Override
		public void modifyChannel(Channel channel) {
			long lastTick = 0;
			for (Note note : notes){
				note.setup(channel.getShift(), channel.getOctave(), channel.getVolume(), channel.getLength(), channel.getTicks());
				channel.addMessage(note);
				lastTick = note.getEndTick();
			}
			
			channel.setTicks(lastTick);
		}

		@Override
		public Command duplicate() {
			Harmony harmony = new Harmony();
			
			for (Note note : notes){
				harmony.addNote(note.duplicate());
			}
			
			return harmony;
		}	
	}
	
	public static class Loop extends Playback{
		private ArrayList<Command> commands;
		
		public Loop(){
			commands = new ArrayList<>();
		}
		
		public void addCommand(Command command){
			commands.add(command);
		}

		@Override
		public void modifyChannel(Channel channel) {
			for (Command command : commands){
				command.processChannel(channel);
			}
		}

		@Override
		public Command duplicate() {
			Loop loop = new Loop();
			
			for (Command command : commands){
				loop.addCommand(command.duplicate());
			}
			return loop;
		}
	}
	
	public static class Section extends Playback{
		private ArrayList<Command> commands;
		public Section(){
			commands = new ArrayList<>();
		}
		
		public void addCommand(Command command){
			commands.add(command);
		}
		
		@Override
		public void modifyChannel(Channel channel) {
			for (Command command : commands){
				Command copyCommand = command.duplicate();
				copyCommand.processChannel(channel);
			}
		}
		
		@Override
		public Command duplicate() {
			Section group = new Section();
			
			for (Command command : commands){
				group.addCommand(command.duplicate());
			}
			return group;
		}
	
	}
}
