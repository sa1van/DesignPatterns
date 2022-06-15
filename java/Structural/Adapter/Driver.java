package Structural.Adapter;

interface MediaPlayer {
    void play();
}

interface AdvanceMediaPlayer {
    void playVlc();
    void playMp4();
}

class VlcMedia implements AdvanceMediaPlayer {

    @Override
    public void playVlc() {
        System.out.println("Playing VLC media");
    }

    @Override
    public void playMp4() {

    }
}

class Mp4Media implements AdvanceMediaPlayer {

    @Override
    public void playVlc() {

    }

    @Override
    public void playMp4() {
        System.out.println("Playing Mp4 media");
    }
}

class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    @Override
    public void play() {

        if(advanceMediaPlayer.getClass().getSimpleName().equals("Mp4Media")) {
            advanceMediaPlayer.playMp4();
        }
        else {
            advanceMediaPlayer.playVlc();
        }
    }
}

//Used for adapting an interface into another according to client expectation.
public class Driver {
    public static void main(String[] args) {

        Mp4Media mp4Media = new Mp4Media();
        VlcMedia vlcMedia = new VlcMedia();

        MediaPlayer mediaPlayer = new MediaAdapter(mp4Media);
        mediaPlayer.play();

        mediaPlayer = new MediaAdapter(vlcMedia);
        mediaPlayer.play();

    }
}
