package model;

public class Album {
    private int year;
    private String title;
    private Artist artist;

    public Album(int year, String title, Artist artist) {
        this.year = year;
        this.title = title;
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", artist=" + artist +
                '}';
    }
}
