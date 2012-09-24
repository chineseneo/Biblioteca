package Biblioteca.library;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void shouldRenderRatedMovie()
    {
        String movieName = "name";
        String producedYear = "year";
        String director = "director";
        String rate = "5";
        Movie movie = new Movie(movieName, producedYear, director, rate);
        assertThat(movie.show(), is(movieName + "\t" + producedYear + "\t" + director + "\t" + rate));
    }

    @Test
    public void shouldRenderUnratedMovie()
    {
        String movieName = "name";
        String producedYear = "year";
        String director = "director";
        Movie movie = new Movie(movieName, producedYear, director);
        assertThat(movie.show(), is(movieName + "\t" + producedYear + "\t" + director + "\tN/A"));
    }
}
