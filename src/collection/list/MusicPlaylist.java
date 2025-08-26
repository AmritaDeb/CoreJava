package collection.list;

import java.util.ArrayList;

public class MusicPlaylist {
	
	public static void main(String[] args) {
        // Create playlist
        ArrayList<String> playlist = new ArrayList<>();

        // Add songs
        playlist.add("Shape of You");
        playlist.add("Perfect");
        playlist.add("Believer");
        playlist.add("Shape of You"); // duplicate allowed

        // Print playlist
        System.out.println("My Playlist: " + playlist);

        // Access song by index
        System.out.println("Now playing: " + playlist.get(2)); // Believer

        // Replace a song
        playlist.set(1, "Photograph");
        System.out.println("Updated Playlist: " + playlist);

        // Remove a song
        playlist.remove("Shape of You"); // removes first occurrence
        System.out.println("After removing one 'Shape of You': " + playlist);

        // Iterate through playlist
        System.out.println("\nAll Songs:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}
