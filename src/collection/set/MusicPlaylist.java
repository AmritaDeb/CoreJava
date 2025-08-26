package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class MusicPlaylist {
	
	public static void main(String[] args) {
        // Create playlist using Set (no duplicates, preserves order)
        Set<String> playlist = new LinkedHashSet<>();

        // Add songs
        playlist.add("Shape of You");
        playlist.add("Perfect");
        playlist.add("Believer");
        playlist.add("Shape of You"); // duplicate ignored

        // Print playlist
        System.out.println("My Playlist: " + playlist);

        // Removing a song
        playlist.remove("Shape of You");
        System.out.println("After removing 'Shape of You': " + playlist);

        // Iterating through playlist
        System.out.println("\nAll Songs:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }

}
