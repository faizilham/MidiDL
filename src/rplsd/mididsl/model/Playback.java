package rplsd.mididsl.model;

import java.util.ArrayList;

public abstract class Playback implements Command{
	public abstract void modifyChannel (TrackObject channel);
	
	@Override
	public void processTrack(TrackObject channel){
		modifyChannel(channel);
	}
	
	public static class Tie extends Playback{
		private ArrayList<Note> notes;
		public Tie(){
			notes = new ArrayList<>();
		}
		
		public void addNote(Note note){
			notes.add(note);
		}
		
		@Override
		public void modifyChannel(TrackObject channel) {
			Note first = null;
			long lastTick = channel.getTicks();
			for (Note note : notes){
				note.setup(channel.getShift(), channel.getOctave(), channel.getVolume(), channel.getLength(), lastTick, channel.getTempo(), channel.getChannel());
				lastTick = note.getEndTick();
				if (first == null){
					first = note.duplicate();
				} else {
					first.join(note);
				}
			}
			
			channel.addMessage(first);
			channel.setTicks(first.getEndTick());
		}

		@Override
		public Command duplicate() {
			Tie tie = new Tie();
			
			for (Note note : notes){
				tie.addNote(note.duplicate());
			}
			
			return tie;
		}	
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
		public void modifyChannel(TrackObject channel) {
			long lastTick = 0;
			for (Note note : notes){
				note.setup(channel.getShift(), channel.getOctave(), channel.getVolume(), channel.getLength(), channel.getTicks(), channel.getTempo(), channel.getChannel());
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
		public void modifyChannel(TrackObject channel) {
			for (Command command : commands){
				command.processTrack(channel);
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
		public void modifyChannel(TrackObject channel) {
			for (Command command : commands){
				Command copyCommand = command.duplicate();
				copyCommand.processTrack(channel);
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
