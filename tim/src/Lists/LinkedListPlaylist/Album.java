package Lists.LinkedListPlaylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Album {
    public static void main(String[] args) {

    }
    private String name;
    private String artist;
    private List<Song> songs = new ArrayList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

        public Optional<Song> findSong(String title){
            if (songs.stream().anyMatch(p -> p.getTitle().equalsIgnoreCase(title))){
                return songs.stream().findFirst();
            }else return null;
        }
}
