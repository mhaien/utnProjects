import java.time.LocalDate;

public class Rent {
    private LocalDate rentDate;
    private LocalDate devolutionDate;
    private Client client;
    private Movie movie;

    public Rent() {
    }

    public Rent(LocalDate rentDate, LocalDate devolutionDate, Client client, Movie movie) {
        this.rentDate = rentDate;
        this.devolutionDate = devolutionDate;
        this.client = client;
        this.movie = movie;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(LocalDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentDate=" + rentDate +
                ", devolutionDate=" + devolutionDate +
                ", client=" + client.toString() +
                ", movie=" + movie.toString() +
                '}';
    }
}
