package Biblioteca.library;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 9:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private String name, author, price;

    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String show() {
        return name + " - " + author + " - " + price;
    }
}
