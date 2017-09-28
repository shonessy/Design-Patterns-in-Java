
public class Demo {

	public static void main(String[] args) {
		AudioPlayer simpleAudioPlayer = new AudioPlayer();
		simpleAudioPlayer.play("Ana Bekuta-Dodji da me ljubis malo", "mp3");
		simpleAudioPlayer.play("Majkl Dzordan-Najbolji potezi", "mp4");
		
		System.out.println("\n************************************************\n");
		
		SimpleAudioPlayerAdapter audioPlayerAdapted = new SimpleAudioPlayerAdapter();
		audioPlayerAdapted.setAdapter("mp4");
		audioPlayerAdapted.play("Mario Zavalio-Najbolji golovi", "mp4");
		
		audioPlayerAdapted.setAdapter("vlc");
		audioPlayerAdapted.play("Java Tutorial - Youtube", "vlc");

	}

}
