interface Streamable {
    void play();
    void pause();
    void recommendContent();
}

class Netflix implements Streamable {
    @Override
    public void play() {
        System.out.println("Netflix: Playing video");
    }
    
    @Override
    public void pause() {
        System.out.println("Netflix: Video paused");
    }
    
    @Override
    public void recommendContent() {
        System.out.println("Netflix: Recommending movies and shows");
    }
}

class Spotify implements Streamable {
    @Override
    public void play() {
        System.out.println("Spotify: Playing music");
    }
    
    @Override
    public void pause() {
        System.out.println("Spotify: Music paused");
    }
    
    @Override
    public void recommendContent() {
        System.out.println("Spotify: Recommending playlists and songs");
    }
}

class YouTube implements Streamable {
    @Override
    public void play() {
        System.out.println("YouTube: Playing video");
    }
    
    @Override
    public void pause() {
        System.out.println("YouTube: Video paused");
    }
    
    @Override
    public void recommendContent() {
        System.out.println("YouTube: Recommending trending videos");
    }
}

public class I2 {
    public static void main(String[] args) {
        Streamable netflix = new Netflix();
        netflix.play();
        netflix.pause();
        netflix.recommendContent();
        
        Streamable spotify = new Spotify();
        spotify.play();
        spotify.pause();
        spotify.recommendContent();
        
        Streamable youtube = new YouTube();
        youtube.play();
        youtube.pause();
        youtube.recommendContent();
    }
}
