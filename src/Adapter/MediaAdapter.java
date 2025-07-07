package Adapter;

// Adapter class
public class MediaAdapter implements MediaPlayer {

  private final AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String audioType) {
    this.advancedMediaPlayer = new AdvancedMediaPlayer();
  }

  @Override
  public void play(String audioType, String fileName) {
    switch (audioType.toLowerCase()) {
      case "vlc" -> advancedMediaPlayer.playVlc(fileName);
      case "mp4" -> advancedMediaPlayer.playMp4(fileName);
      default -> System.out.println("Invalid media type: " + audioType);
    }
  }
}