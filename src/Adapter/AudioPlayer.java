package Adapter;

// Concrete class using the adapter
public class AudioPlayer implements MediaPlayer {

  @Override
  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing MP3 file: " + fileName);
    } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
      MediaAdapter mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, fileName);
    } else {
      System.out.println("Unsupported audio type: " + audioType);
    }
  }
}