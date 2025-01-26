package package_real_world_interfaces;

public class MusicPlayer implements Player{
	
	public MusicPlayer() {
	}
	@Override
	public void play(String title) {
		System.out.println("Now playing the track: "+title);
	}
	@Override
	public void pause() {
		System.out.println("Music is paused.");
	}
	@Override
	public void stop() {
		System.out.println("Music is stopped.");
	}
	public void shuffle() {
		System.out.println("Shuffling playlist!");
	}
	public void adjustVolume(int volume) {
		System.out.println("Volume set to " + volume);
	}
	
}

