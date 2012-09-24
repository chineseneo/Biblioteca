package Biblioteca.option;

import Biblioteca.IO.IO;
import Biblioteca.library.Book;
import Biblioteca.library.Library;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReserveOptionTest {
    private String successMessage = "Thank You! Enjoy the book.";
    private String failMessage = "Sorry we don't have that book yet.";

    private List<Book> bookList;
    private ReserveOption option;
    private IO io;

    @Before
    public void init() {

        io = new IO();
        io.setWriter(new BufferedWriter(new StringWriter()));
        bookList = new Library().getBookList();
    }

    @Test
    public void shouldAcceptValidUserChoice() throws IOException
    {
        io.setReader(new BufferedReader(new StringReader("1")));
        option = new ReserveOption(bookList, io);
        option.setSuccessMessage(successMessage);
        assertEquals(successMessage, option.execute());
    }

    @Test
    public void shouldRejectInvalidUserChoice() throws IOException
    {
        io.setReader(new BufferedReader(new StringReader("3")));
        option = new ReserveOption(bookList, io);
        option.setRejectMessage(failMessage);
        assertEquals(failMessage, option.execute());
    }
}
