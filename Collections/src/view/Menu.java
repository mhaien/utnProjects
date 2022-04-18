package view;

import list.Reproduction;
import list.impl.BasicList;
import list.impl.PremiumList;
import model.Album;
import model.Artist;
import model.Genre;
import model.Song;

import java.util.*;

public class Menu {

    public static void startMenu(Reproduction list) {

        Scanner scan = new Scanner(System.in);
        int op = 0;
        while (op >= 0 && op < 5) {
            System.out.println("Bienvenidos a la interfaz de manejo de Canciones.");
            System.out.println("1 -> Reproducir Musica");
            System.out.println("2 -> Añadir cancion");
            System.out.println("3 -> Eliminar cancion");
            System.out.println("4 -> Ver lista");
            System.out.println("0 -> SALIR");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    list.play();
                    break;
                case 2:
                    list.addSong();
                    break;
                case 3:
                    list.removeSong();
                    break;
                case 4:
                    list.showList();
                    break;
                case 0:
                    return;
            }
        }

    }

}
