package model;

public class Song {
    private String name;
    private int duration;
    private Genre genre;
    private Album album;
    private Artist feat;

    public Song(String name, int duration, Genre genre, Album album, Artist artist) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.feat = artist;
    }

    public Song(String name, int duration, Genre genre, Album album) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return feat;
    }

    public void setArtist(Artist artist) {
        this.feat = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", album=" + album +
                ", feat=" + feat +
                '}';
    }
}

