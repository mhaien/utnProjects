import punto1.Author;
import punto1.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*Guia Dos ej 1*/
        Author author = new Author("Joshua", "Bloch", "joshua@email.com", 'F');
        System.out.println(author);
        Book book = new Book("Effective Java", 500, 50, new ArrayList<>(Arrays.asList(author)));
        System.out.println(book);

        book.setPrice(500);
        book.setStock(book.getStock() + 50);

        System.out.println(book.getAuthor().get(0));

        Author author1 = new Author("Emi", "Ramirez", "joshua@email.com", 'F');
        book.getAuthor().add(author1);
        book.showAuthors();


    }


}
