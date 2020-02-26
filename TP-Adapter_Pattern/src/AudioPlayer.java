
public class AudioPlayer implements SimpleAudioPlayer {

	@Override
	public void play(String fileName, String fileType) {
		if(fileType.equalsIgnoreCase("mp3"))
			System.out.println("Audio Player is playing: \"" + fileName + ".mp3\"");
		else
			System.out.println("Audio Player cannot play unsuported file format: " + fileType);

	}

}
