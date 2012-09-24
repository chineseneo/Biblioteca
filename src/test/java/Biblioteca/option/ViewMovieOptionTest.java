package Biblioteca.option;

import Biblioteca.library.Library;
import Biblioteca.library.Movie;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewMovieOptionTest {

    private List<Movie> movieList;

    @Test
    public void shouldRenderMovieList()
    {
        movieList = new Library().getMovieList();
        String movieListString = "Movie\tYear\tDirector\tRating\n";
        for (int i = 0; i < movieList.size(); i++)
        {
            movieListString += String.valueOf(i + 1) + movieList.get(i).show() + "\n";
        }
        ViewMovieOption option = new ViewMovieOption(new Library());
        assertThat(option.execute(), is(movieListString));
    }
}
