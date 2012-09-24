package Biblioteca.library;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private String name;
    private String year;
    private String director;
    private String rate;

    public Movie(String name, String year, String director, String rate) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
    }

    public Movie(String name, String year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }

    public String show() {
        return name + "\t" + year + "\t" + director + "\t" + (rate == null ? "N/A" : rate);
    }
}
