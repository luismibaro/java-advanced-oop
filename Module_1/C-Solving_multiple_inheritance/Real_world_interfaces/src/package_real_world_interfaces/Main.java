package package_real_world_interfaces;

public class Main {
	public static void main(String[] args) {
		//Declare MusicPlayer object
		MusicPlayer player = new MusicPlayer();
		//start playing a song
		player.play("Life might be a Deep Fake");
		//adjust volume
		player.adjustVolume(50);

	}
}
