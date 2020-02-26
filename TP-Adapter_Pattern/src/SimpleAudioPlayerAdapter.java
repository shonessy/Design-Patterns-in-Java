
public class SimpleAudioPlayerAdapter implements SimpleAudioPlayer {
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public void setAdapter(String fileType) {
		if(fileType.equalsIgnoreCase("vlc"))
			this.advancedMediaPlayer = new VlcPlayer();
		else if(fileType.equalsIgnoreCase("mp4"))
			this.advancedMediaPlayer = new Mp4Player();
	}
	
	@Override
	public void play(String fileName, String fileType) {
		if(fileType.equalsIgnoreCase("vlc"))
			this.advancedMediaPlayer.playVlc(fileName);
		else if(fileType.equalsIgnoreCase("mp4"))
			this.advancedMediaPlayer.playMp4(fileName);

	}

}
