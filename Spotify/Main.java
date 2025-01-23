import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicStreamingService musicStreamingService=new MusicStreamingService();

        User user1=new User("1","utkarsh","pwutkarsh");
        User user2=new User("2","prakash","pwprakash");

        Song song1=new Song("1","song 1","artist 1","album1",180);
        Song song2=new Song("2","song 2","artist 2","album2",200);
        Song song3=new Song("3","song 3","artist 3","album3",380);

        Album album1=new Album("1","title1","artist1", List.of(song1));
        Album album2=new Album("2","title2","artist2", List.of(song2));
        Album album3=new Album("3","title3","artist3", List.of(song3));

        Artist artist1=new Artist("1","artist1",List.of(album1));
        Artist artist2=new Artist("2","artist2",List.of(album2));
        Artist artist3=new Artist("3","artist3",List.of(album3));

        musicStreamingService.getMusicLibrary().addArtist(artist1);
        musicStreamingService.getMusicLibrary().addArtist(artist2);
        musicStreamingService.getMusicLibrary().addArtist(artist3);

        musicStreamingService.getUserManager().registerUser(user1);
        User loggedUser = musicStreamingService.getUserManager().loginUser("utkarsh","pwutkarsh");

        if(loggedUser!=null){
            System.out.println("User logged in: " + loggedUser.getUsername());
        }else{
            System.out.println("Invalid username or password.");
        }

        List<Song> searchResult=musicStreamingService.getMusicLibrary().searchSong("artist1");
        System.out.println("Search Results:");
        for (Song song : searchResult) {
            System.out.println("Song: " + song.getTitle() + " - " + song.getArtist());
        }

        Playlist playlist=new Playlist("1","my playlist",loggedUser);
        playlist.addSong(song1);
        playlist.addSong(song2);
        loggedUser.addPlaylist(playlist);

        List<Song> recommendation=musicStreamingService.getMusicRecommender().recommendSongs(loggedUser);
        System.out.println("Recommended Songs:");
        for (Song song : recommendation) {
            System.out.println("Song: " + song.getTitle() + " - " + song.getArtist());
        }

        MusicPlayer musicPlayer=new MusicPlayer();
        musicPlayer.PlaySong(song1);
        musicPlayer.pauseSong();
        musicPlayer.seek(111);

        List<Playlist> userPlaylists = loggedUser.getPlaylists();
        System.out.println("User Playlists:");
        for (Playlist userPlaylist : userPlaylists) {
            System.out.println("Playlist: " + userPlaylist.getName());
            System.out.println("Songs:");
            for (Song song : userPlaylist.getSongs()) {
                System.out.println("- " + song.getTitle());
            }
        }

        System.out.println("Hello, World!");
    }
}