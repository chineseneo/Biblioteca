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
    private List<User> userList;

    public Library()
    {
        initBooks();
        initMovie();
        userList = new ArrayList<User>();
        userList.add(new User("111-1111", "password"));
    }

    private void initMovie() {
        movieList = new ArrayList<Movie>();
        Movie Scholay = new Movie("Scholay", "1975", "Ramesh Sippy");
        Movie Shawshank = new Movie("The Shawshank Redemption", "1994", "Frank Darabont", "9.2");
        Movie GodFather = new Movie("The Godfather", "1972", "Francis Ford Coppola", "9.2");
        Movie PulpFiction = new Movie("Pulp Fiction", "1994", "Quentin Tarantino", "9.0");
        Movie TheGoodTheBadAndTheUgly = new Movie("The Good, the Bad and the Ugly", "1967", "Sergio Leone", "9.0");
        Movie AngryMen = new Movie("12 Angry Men", "1957", "Sidney Lumet ", "8.9");
        Movie Schindler = new Movie("Schindler's List", "1993", "Steven Spielberg", "8.9");
        Movie TheDarkKnight = new Movie("The Dark Knight", "2004", "Christopher Nolan", "8.9");
        Movie Rings3 = new Movie("The Lord of the Rings: The Return of the King", "2003", "Peter Jackson", "8.9");
        Movie FlewOver = new Movie("One Flew Over the Cuckoo's Nest", "1975", "Milos Forman", "8.8");
        Movie StarWars = new Movie("Star Wars: Episode V - The Empire Strikes Back", "1980", "Irvin Kershner", "8.8");
        Movie FightClub = new Movie("Fight Club", "1999", "David Fincher", "8.8");
        Movie SevenSamurai = new Movie("Seven Samurai", "1956", "Akira Kurosawa", "8.8");
        Movie Inception = new Movie("Inception", "2011", "Christopher Nolan");
        Movie Rings1 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "2001", "Peter Jackson", "8.8");
        movieList.add(Scholay);
        movieList.add(Shawshank);
        movieList.add(GodFather);
        movieList.add(PulpFiction);
        movieList.add(TheGoodTheBadAndTheUgly);
        movieList.add(AngryMen);
        movieList.add(Schindler);
        movieList.add(TheDarkKnight);
        movieList.add(Rings3);
        movieList.add(FlewOver);
        movieList.add(StarWars);
        movieList.add(FightClub);
        movieList.add(SevenSamurai);
        movieList.add(Inception);
        movieList.add(Rings1);
    }

    private void initBooks() {
        bookList = new ArrayList<Book>();
        Book headFirstJava = new Book("Head First Java", "Sierra & Bates", "79.00");
        Book headFirstRails = new Book("Head First Rails", "David Griffiths", "49.99");
        bookList.add(headFirstJava);
        bookList.add(headFirstRails);
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
        return movieList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public Boolean userExist(String ID, String password) {
        for(User user : userList)
        {
            if (user.verify(ID, password))
                return true;
        }
        return false;
    }
}
