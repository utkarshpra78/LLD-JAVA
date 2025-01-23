import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MusicLibrary {
    private static MusicLibrary instance;
    private final Map<String,Song> songs;
    private final Map<String,Album> albums;
    private final Map<String,Artist> artists;

    private MusicLibrary(){
        songs=new ConcurrentHashMap<>();
        albums=new ConcurrentHashMap<>();
        artists=new ConcurrentHashMap<>();
    }

    public static synchronized MusicLibrary getInstance(){
        if(instance==null){
            instance=new MusicLibrary();
        }
        return instance;
    }

    public void addSong(Song song){
        songs.put(song.getId(),song);
    }

    public void addAlbum(Album album){
        albums.put(album.getId(),album);
        for(Song song:album.getSongs()){
            addSong(song);
        }
    }

    public void addArtist(Artist artist){
        artists.put(artist.getId(),artist);
        for(Album album:artist.getAlbums()){
            addAlbum(album);
        }
    }

    public Map<String, Song> getSongs() {
        return songs;
    }

    public Map<String, Album> getAlbums() {
        return albums;
    }

    public Map<String, Artist> getArtists() {
        return artists;
    }

    public List<Song> searchSong(String query){
        List<Song> matchingSong=new ArrayList<>();

        for(Song song:songs.values()){
            if(song.getArtist().contains(query) || song.getAlbum().contains(query) || song.getTitle().contains(query)){
                matchingSong.add(song);
            }
        }
        return matchingSong;
    }
}
