package Biblioteca.library;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {

    private Library library;

    @Before
    public void init() {
        library = new Library();
    }

    @Test
    public void shouldAddBookToBookList()
    {
        Book book = new Book("book1", "author1", "0.00");
        library.addBook(book);
        List<Book> bookList = library.getBookList();
        assertThat(bookList.contains(book), is(true));
    }

    @Test
    public void shouldAddMovieToMovieList()
    {
        Movie movie = new Movie("movie", "year", "director", "9");
        library.addMovie(movie);
        List<Movie> movieList = library.getMovieList();
        assertThat(movieList.contains(movie) ,is(true));
    }

    @Test
    public void shouldAddUserToUserList()
    {
        User user = new User("111-1111", "password");
        library.addUser(user);
        List<User> userList = library.getUserList();
        assertThat(userList.contains(user), is(true));
    }

    @Test
    public void shouldReturnTrueWhenVerifyExistingUserAccount()
    {
        String ID = "111-1111";
        String password = "password";
        User user = new User(ID, password);
        library.addUser(user);
        assertThat(library.userExist(ID, password), is(true));
    }

    @Test
    public void shouldReturnFalseWhenVerifyNonExistingUserAccount()
    {
        String ID = "";
        String password = "";
        User user = new User(ID, password);
        assertThat(library.userExist(ID, password), is(false));
    }
}
