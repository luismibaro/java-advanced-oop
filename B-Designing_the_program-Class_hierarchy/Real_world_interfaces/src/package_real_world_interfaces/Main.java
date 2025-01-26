package package_real_world_interfaces;

public class Main {
	public static void main(String[] args) {
		//Declare MusicPlayer object
		MusicPlayer m = new MusicPlayer();
		//start playing a song
		m.play("Life misght be a Deep Fake");
		// Adjust volume
		m.adjustVolume(50);
		// pause the player
		m.pause();
		// stop playing
		m.stop();
	}
}
