package list.impl;

import list.Reproduction;
import model.Song;

import java.util.Stack;

public class BasicList implements Reproduction {
    private String name;
    private Stack<Song> myList;

    public BasicList(String name, Stack<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    @Override
    public void play() {
        Song song = myList.pop();
        System.out.println("Reproduciendo la siguiente cancion: " + song);
        putAtEnd(song);
    }

    @Override
    public void addSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");

    }

    @Override
    public void removeSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");

    }

    @Override
    public void showList() {
        myList.stream().forEach(System.out::println);
    }

    private void putAtEnd(Song song) {
        Stack<Song> aux = new Stack<>();
        while(!myList.empty())
        {
            aux.push(myList.pop());
        }
        aux.push(song);
        while (!aux.empty())
        {
            myList.push(aux.pop());
        }
    }
}
