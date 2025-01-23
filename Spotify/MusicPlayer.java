public class MusicPlayer {
    private Song curentSong;
    private boolean isPlaying;
    private int currentTime;

    public void PlaySong(Song song){
        curentSong=song;
        isPlaying=true;
        currentTime=0;
        System.out.println("currently playing song " + curentSong.getTitle());
    }

    public void pauseSong(){
        isPlaying=false;
        System.out.println("pause the song " + curentSong.getTitle());
    }

    public void seek(int time){
        currentTime=time;
        System.out.println("time seek to " + currentTime);
    }

    public Song getCurentSong() {
        return curentSong;
    }
}
