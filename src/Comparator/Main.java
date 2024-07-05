package Comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Imagine", "John Lennon", 75));
        songs.add(new Song("Hey Jude", "The Beatles", 72));
        songs.add(new Song("Bohemian Rhapsody", "Queen", 71));

        // Sort by title using lambda expression
        songs.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        System.out.println("Sorted by title: " + songs);

        // Sort by artist using lambda expression
        songs.sort((s1, s2) -> s1.getArtist().compareTo(s2.getArtist()));
        System.out.println("Sorted by artist: " + songs);

        // Sort by BPM using lambda expression
        songs.sort((s1, s2) -> Integer.compare(s1.getBpm(), s2.getBpm()));
        System.out.println("Sorted by BPM: " + songs);
    }
}
