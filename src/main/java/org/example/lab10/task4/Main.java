package org.example.lab10.task4;

import java.util.*;

class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre;
    }
}

class GenreFilterIterator implements Iterator<Song> {
    private List<Song> playlist;
    private String targetGenre;
    private int currentIndex;

    public GenreFilterIterator(List<Song> playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size()) {
            if (playlist.get(currentIndex).getGenre().equalsIgnoreCase(targetGenre)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Song next() {
        while (currentIndex < playlist.size() && !playlist.get(currentIndex).getGenre().equalsIgnoreCase(targetGenre)) {
            currentIndex++;
        }

        if (currentIndex >= playlist.size()) {
            System.out.println("No more " + targetGenre + " songs");
            return null;
        }

        return playlist.get(currentIndex++);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Blinding Lights", "The Weeknd", "Pop"));
        playlist.add(new Song("Shape of You", "Ed Sheeran", "Pop"));
        playlist.add(new Song("Bohemian Rhapsody", "Queen", "Rock"));
        playlist.add(new Song("Hotel California", "Eagles", "Rock"));
        playlist.add(new Song("Lose Yourself", "Eminem", "Hip-Hop"));
        playlist.add(new Song("Bad Guy", "Billie Eilish", "Pop"));

        GenreFilterIterator popIterator = new GenreFilterIterator(playlist, "Pop");

        System.out.println("Songs with 'Pop' genre:");
        while (popIterator.hasNext()) {
            Song song = popIterator.next();
            System.out.println(song);
        }
    }
}
