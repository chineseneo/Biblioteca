package Biblioteca.option;

import Biblioteca.library.Library;
import Biblioteca.library.Movie;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewMovieOption implements UserOption{
    List<Movie> movieList;

    public ViewMovieOption(Library library) {
        movieList = library.getMovieList();
    }

    public String execute() {
        String movieListString = "Movie\tYear\tDirector\tRating\n";
        for(int i = 0; i < movieList.size(); i++)
        {
            movieListString += String.valueOf(i + 1) + movieList.get(i).show() + "\n";
        }
        return movieListString;
    }
}
