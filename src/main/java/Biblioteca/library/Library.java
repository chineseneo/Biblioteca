package Biblioteca.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {

    private List<Book> bookList;
    private List<Movie> movieList;

    public Library()
    {
        bookList = new ArrayList<Book>();
        Book headFirstJava = new Book("Head First Java", "Sierra & Bates", "79.00");
        Book headFirstRails = new Book("Head First Rails", "David Griffiths", "49.99");
        bookList.add(headFirstJava);
        bookList.add(headFirstRails);
        movieList = new ArrayList<Movie>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public List<Movie> getMovieList() {
        return movieList;  //To change body of created methods use File | Settings | File Templates.
    }
}
