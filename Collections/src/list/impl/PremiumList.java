package list.impl;

import list.Reproduction;
import model.Album;
import model.Artist;
import model.Genre;
import model.Song;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PremiumList implements Reproduction {
    private String name;
    private LinkedList<Song> myList;
    private Scanner scanner = new Scanner(System.in);

    public PremiumList(String name, LinkedList<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    @Override
    public void play() {
        showList();
        String songName = scanner.nextLine();
        getSongByName(songName);
        do {
            System.out.println("Reproduciendo " + songName);
        } while (!scanner.nextLine().equals("p"));

    }

    private void getSongByName(String name) {
        myList.stream()
                .filter(song -> song.getName().equals(name))
                .findFirst()
                .ifPresentOrElse(song -> System.out.println("Reproduciendo " + name),
                        () -> System.out.println("No se encontro cancion"));
    }

    @Override
    public void addSong() {
        myList.add(new Song("Que bonito", 3, Genre.CLASICA, new Album(2005, "BANDA XXI", new Artist("BANDA XXI", 25, "Argentinos"))));
    }

    @Override
    public void removeSong() {
        name = "The adults are talking";
        Iterator<Song> it = myList.iterator();
        while (it.hasNext()) {
            Song song = it.next();
            if (song.getName().equals(name)) {
                it.remove();
                return;
            }
        }
    }

    @Override
    public void showList() {
        myList.forEach(System.out::println);
    }
}
