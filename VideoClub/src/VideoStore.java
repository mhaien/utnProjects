import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class VideoStore {
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Rent> rents = new ArrayList<>();

    public VideoStore(ArrayList<Client> clients, ArrayList<Movie> movies, ArrayList<Rent> rents) {
        this.clients = clients;
        this.movies = movies;
        this.rents = rents;
    }


    public void rentMovie(String clientName, String movieTitle, LocalDate devolutionDate) {
        Client client;
        if (existClient(clientName)) {
            client = getClientByName(clientName);
        } else {

            System.out.println("Usted no se encuentra registrado en el VideoStore, por favor, ingrese los datos correspondiente.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese direccion");
            String dir = sc.nextLine();
            System.out.println("Ingrese telefono");
            String tel = sc.nextLine();
            client = new Client(clientName, tel, dir);

        }

        Movie movie = existMovie(movieTitle) ? getMovieByName(movieTitle) : null;
        if (movie == null) {
            System.out.println("No se encontró titulo " + movieTitle);
            return;
        }
        if (availableMovie(movie)) {
            System.out.println("No se encuentra disponible " + movieTitle);
            return;
        }
        movie.setStock(movie.getStock() - 1);
        Rent rent = new Rent(LocalDate.now(), devolutionDate, client, movie);
        System.out.println("Comprobante de renta -> " + rent);
        rents.add(rent);
    }

    private boolean availableMovie(@NotNull Movie movie) {
        return movie.getStock() < 0;
    }

    private Movie getMovieByName(String movieTitle) {
        return movies.stream().filter(c -> c.getTitle().equals(movieTitle)).findFirst().orElseGet(() -> null);
    }

    private boolean existMovie(String movieTitle) {
        return movies.stream().anyMatch(c -> c.getTitle().equals(movieTitle));
    }

    private Client getClientByName(String clientName) {
        return clients.stream().filter(c -> c.getName().equals(clientName)).findFirst().orElseGet(() -> null);
    }

    private boolean existClient(String clientName) {
        return clients.stream().anyMatch(c -> c.getName().equals(clientName));
    }

    public void getCurrentRents() {
        rents.stream()
                .filter(rent -> rent.getRentDate().isBefore(LocalDate.now()) && rent.getDevolutionDate().isAfter(LocalDate.now()))
                .forEach(System.out::println);

    }

    public void getMoviesToReturn() {
        rents.stream().filter(rent -> rent.getDevolutionDate().isEqual(LocalDate.now()))
                .forEach(System.out::println);
    }

    public void getMoviesToReturn(LocalDate day) {
        rents.stream().filter(rent -> rent.getDevolutionDate().isEqual(day))
                .forEach(System.out::println);
    }

    public void getLast10RentsForClient(String name) {
        if (!existClient(name)) {
            System.out.println("No existe cliente " + name);
            return;
        }
        List<Rent> rentsForClient = rents.stream().filter(rent -> rent.getClient().getName().equals(name)).collect(Collectors.toList());
        Iterator<Rent> it = rentsForClient.iterator();
        int i = 0;
        while (it.hasNext() || i < 10) {
            Rent rent = it.next();
            System.out.println(rent.toString());
        }
    }

    public void getMoviesByGenre(String genre) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(String.format("Las peliculas englobadas en el genero %s son ", genre));
        movies.stream().filter(m -> m.getGenre().toString().equals(genre)).forEach(System.out::println);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void getMovieDetailedInformation(String title) {
        movies.stream()
                .filter(m -> m.getTitle().equals(title))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("No se encontro la pelicula con el titulo " + title));

    }

    public void getMostRentedMovies() {
        Map<String, Long> mostRentedMovies = rents.stream().collect(Collectors.groupingBy(r -> r.getMovie().getTitle(), Collectors.counting()));
        Map.Entry<String, Long> mostRentedMovie = mostRentedMovies.entrySet().stream().max((movie1, movie2) -> movie1.getValue() > movie2.getValue() ? 1 : -1).get();
        System.out.println(String.format("La pelicula %s se alquiló %s veces", mostRentedMovie.getKey(), mostRentedMovie.getValue()));

    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Rent> getRents() {
        return rents;
    }

    public void setRents(ArrayList<Rent> rents) {
        this.rents = rents;
    }
}
