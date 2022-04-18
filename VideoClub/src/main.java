import java.time.LocalDate;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        VideoStore store = initializeVideoStore();

        store.getMovieDetailedInformation("Batman");
        store.getMovieDetailedInformation("Matrix");
        store.getMoviesByGenre(Movie.Genre.DRAMA.toString());
        store.getCurrentRents();
        store.getMostRentedMovies();
        store.getMoviesToReturn();
        store.getMoviesToReturn(LocalDate.of(2022, 04, 15));


        store.rentMovie("Felipe Sexto", "Batman", LocalDate.of(2022, 06, 13));
        store.rentMovie("Emiliano Ramirez", "Batman", LocalDate.of(2022, 04, 15));
        store.getLast10RentsForClient("Emiliano Ramirez");
    }

    private static VideoStore initializeVideoStore() {
        Client client1 = new Client("Emiliano Ramirez", "2235500787", "Gascon 2961");
        Client client2 = new Client("Jorge Corona", "222312310787", "Garay 2961");
        Client client3 = new Client("Sergio Aguero", "22132131387", "Manchester 2961");
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        Movie movie1 = new Movie("Batman", Movie.Genre.ACCION, LocalDate.of(2022, 03, 15), 160, "EEUU", "LA PELICULA DE BATMAN DIRIGIDA POR MAT REEVES", 5, Movie.Clasification.NC17);
        Movie movie2 = new Movie("EL SECRETO DE SUS OJOS", Movie.Genre.AVENTURA, LocalDate.of(2015, 06, 10), 100, "ARG", "LA PELICULA DE BATMAN DIRIGIDA POR MAT REEVES", 5, Movie.Clasification.PG);
        Movie movie3 = new Movie("JUJUTSU KAISEN 0", Movie.Genre.HORROR, LocalDate.of(2022, 04, 23), 120, "JP", "LA PELICULA DE JUJUTSU KAISEN TRAIDA DIRECTAMENTE DE JAPON", 12, Movie.Clasification.PG13);
        Movie movie4 = new Movie("El irlandes", Movie.Genre.DRAMA, LocalDate.of(2020, 06, 15), 500, "EEUU", "LA ULTIMA PELICULA MARTIN SCORSESE, TREMENDA", 22, Movie.Clasification.NC17);
        Movie movie5 = new Movie("KOE NO KATACHI", Movie.Genre.DRAMA, LocalDate.of(2018, 03, 12), 112, "JP", "LA ULTIMA PELICULA MARTIN SCORSESE, TREMENDA", 22, Movie.Clasification.PG13);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        Rent rent1 = new Rent(LocalDate.of(2021, 05, 05), LocalDate.of(2022, 05, 05), client1, movie3);
        Rent rent2 = new Rent(LocalDate.of(2021, 05, 05), LocalDate.of(2022, 05, 05), client2, movie3);
        Rent rent3 = new Rent(LocalDate.of(2021, 05, 05), LocalDate.of(2022, 05, 05), client3, movie3);
        Rent rent4 = new Rent(LocalDate.of(2021, 05, 05), LocalDate.of(2022, 04, 04), client1, movie2);
        Rent rent5 = new Rent(LocalDate.of(2022, 02, 02), LocalDate.of(2022, 04, 04), client1, movie1);

        ArrayList<Rent> rents = new ArrayList<>();
        rents.add(rent1);
        rents.add(rent2);
        rents.add(rent3);
        rents.add(rent4);
        rents.add(rent5);


        return new VideoStore(clients, movies, rents);
    }
}

