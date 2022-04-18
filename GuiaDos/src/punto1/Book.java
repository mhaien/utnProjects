package punto1;

import java.util.ArrayList;

public class Book {
    String title;
    Integer price;
    Integer stock;
    ArrayList<Author> authors;

    public Book() {

    }

    public Book(String title, Integer price, Integer stock, ArrayList authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public ArrayList getAuthor() {
        return authors;
    }

    public void setAuthor(ArrayList authors) {
        this.authors = authors;
    }

    public void showAuthors()
    {
        authors.forEach(System.out::println);
    }
    @Override
    public String toString() {
        String authorsString = "";
        for(Author author : authors)
        {
            if(authorsString.isBlank())
            {
                authorsString.concat(author.getCompleteName());
            }else
            {
                authorsString.concat(" y " + author.getCompleteName());
            }
        }
        return String.format("El libro, %s de %s. Se vende a %s pesos",title, authorsString, price);
    }
}
