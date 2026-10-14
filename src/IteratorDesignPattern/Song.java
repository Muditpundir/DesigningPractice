package IteratorDesignPattern;


public class Song {
    public String getTitle() {
        return title;
    }

    private final String title;
    private final String artist;
    private final boolean isFavorite;

    public Song(String title, String artist, boolean isFavorite) {
        this.title = title;
        this.artist = artist;
        this.isFavorite = isFavorite;
    }

    public String title() {
        return title;
    }

    public String artist() {
        return artist;
    }

    public String getArtist() {
        return artist;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
}
