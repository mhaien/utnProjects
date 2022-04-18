import list.Reproduction;
import list.impl.BasicList;
import list.impl.PremiumList;
import model.Album;
import model.Artist;
import model.Genre;
import model.Song;
import view.Menu;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class main {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        Stack<Song> songStack = new Stack<>();
        setUpLists(songStack, null);
        Reproduction basicList = new BasicList("Lista Basica", songStack);

        LinkedList<Song> songlists = new LinkedList<>();
        setUpLists(null, songlists);
        Reproduction premiumList = new PremiumList("Lista Premium", songlists);

        int respuesta;

        do {
            System.out.println("Bienvenido a la interfaz de reproduccion! Elija una opción (0 para salir):");
            System.out.println("1 - Utilizar Lista Basica");
            System.out.println("2 - Utilizar Lista Premium");

            respuesta = miScanner.nextInt();

            switch (respuesta) {
                case 1:
                    Menu.startMenu(basicList);
                    break;
                case 2:
                    Menu.startMenu(premiumList);
                    break;
                default:
                    System.out.println("Opción no valida. Reintente");
                    break;
            }
        } while (respuesta != 0);

        System.out.println("Saliendo del programa.");
    }

    private static void setUpLists(Stack<Song> stack, LinkedList<Song> list) {
        Artist strokes = new Artist("The Strokes", 25, "Estadounidense");
        Album theNewAbnormal = new Album(2021, "The new abnormal", strokes);
        Song theAdultsAreTalking = new Song("The adults are talking", 4, Genre.ROCK, theNewAbnormal);

        Artist duki = new Artist("Duki", 27, "Argentino");
        Artist quevedo = new Artist("Quevedo", 22, "Español");
        Album temporadaDeReggeaton = new Album(2022, "Temporada de Reggeaton", duki);
        Song siQuierenFrontear = new Song("Si quieren frontear", 3, Genre.TRAP, temporadaDeReggeaton, quevedo);

        Artist mariyaTekeuchi = new Artist("Mariya Takeuchi", 50, "Japonesa");
        Album cityPop = new Album(1986, "CITY POP", mariyaTekeuchi);
        Song stayWithMe = new Song("Stay with me", 3, Genre.POP, cityPop);

        if (stack != null) {
            stack.addAll(Arrays.asList(theAdultsAreTalking, siQuierenFrontear, stayWithMe));
            return;
        }

        list.addAll(Arrays.asList(theAdultsAreTalking, siQuierenFrontear, stayWithMe));

    }
}
