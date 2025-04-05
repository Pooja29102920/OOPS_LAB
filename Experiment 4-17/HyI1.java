interface VideoPlayer {
    void pause();
}

interface AudioPlayer {
    void changeVolume(int level);
}

class MediaFile {
    String title;

    MediaFile(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing: " + title);
    }

    void stop() {
        System.out.println("Stopped: " + title);
    }
}

class MP3Player extends MediaFile implements AudioPlayer {
    MP3Player(String title) {
        super(title);
    }

    public void changeVolume(int level) {
        System.out.println("MP3 Player volume set to: " + level);
    }
}

class MP4Player extends MediaFile implements VideoPlayer, AudioPlayer {
    MP4Player(String title) {
        super(title);
    }

    public void pause() {
        System.out.println("MP4 Player paused: " + title);
    }

    public void changeVolume(int level) {
        System.out.println("MP4 Player volume set to: " + level);
    }
}

class StreamingApp extends MediaFile implements VideoPlayer, AudioPlayer {
    StreamingApp(String title) {
        super(title);
    }

    public void pause() {
        System.out.println("Streaming app paused: " + title);
    }

    public void changeVolume(int level) {
        System.out.println("Streaming app volume set to: " + level);
    }
}

public class HyI1{
    public static void main(String[] args) {
        MP3Player mp3 = new MP3Player("Song.mp3");
        mp3.play();
        mp3.changeVolume(50);
        mp3.stop();

        MP4Player mp4 = new MP4Player("Video.mp4");
        mp4.play();
        mp4.pause();
        mp4.changeVolume(70);
        mp4.stop();

        StreamingApp app = new StreamingApp("Live Stream");
        app.play();
        app.pause();
        app.changeVolume(80);
        app.stop();
    }
}
