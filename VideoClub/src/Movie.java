import java.time.LocalDate;

public class Movie {
    private String title;
    private Genre genre;
    private LocalDate premiere;
    private int duration;
    private String countryIsocode;
    private String description;
    private int stock;
    private Clasification clasification;

    public Movie() {
    }

    public Movie(String title, Genre genre, LocalDate premiere, int duration, String countryIsocode, String description, int stock, Clasification clasification) {
        this.title = title;
        this.genre = genre;
        this.premiere = premiere;
        this.duration = duration;
        this.countryIsocode = countryIsocode;
        this.description = description;
        this.stock = stock;
        this.clasification = clasification;
    }

    public Clasification getClasification() {
        return clasification;
    }

    public void setClasification(Clasification clasification) {
        this.clasification = clasification;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getPremiere() {
        return premiere;
    }

    public void setPremiere(LocalDate premiere) {
        this.premiere = premiere;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCountryIsocode() {
        return countryIsocode;
    }

    public void setCountryIsocode(String countryIsocode) {
        this.countryIsocode = countryIsocode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public enum Genre {
        ACCION, AVENTURA, COMEDIA, DRAMA, HORROR, DOCUMENTAL
    }

    public enum Clasification {
        G, PG, PG13, R, NC17, UNRATED
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", premiere=" + premiere +
                ", duration=" + duration +
                ", countryIsocode='" + countryIsocode + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", clasification=" + clasification +
                '}';
    }
}


