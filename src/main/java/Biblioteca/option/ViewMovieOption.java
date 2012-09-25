package Biblioteca.option;

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

    public ViewMovieOption(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public String execute() {
        String movieListString = "Movie\tYear\tDirector\tRating\n";
        for(int i = 0; i < movieList.size(); i++)
        {
            movieListString += movieList.get(i).show() + "\n";
        }
        return movieListString;
    }
}
