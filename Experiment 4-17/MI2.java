class AudioFile {
    String title;

    AudioFile(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing: " + title);
    }

    void pause() {
        System.out.println("Paused: " + title);
    }
}

class MusicTrack extends AudioFile {
    String artist;

    MusicTrack(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    void displayArtist() {
        System.out.println("Artist: " + artist);
    }
}

class PremiumMusicTrack extends MusicTrack {
    PremiumMusicTrack(String title, String artist) {
        super(title, artist);
    }

    void download() {
        System.out.println("Downloading: " + title);
    }

    void enableLosslessAudio() {
        System.out.println("Lossless audio enabled for: " + title);
    }
}

public class MI2 {
    public static void main(String[] args) {
        PremiumMusicTrack track = new PremiumMusicTrack("Shape of You", "Ed Sheeran");
        track.play();
        track.displayArtist();
        track.download();
        track.enableLosslessAudio();
        track.pause();
    }
}