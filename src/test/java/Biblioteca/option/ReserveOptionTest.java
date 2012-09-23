package Biblioteca.option;

import Biblioteca.IO.IO;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
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

    private List<String> bookList;
    private ReserveOption option;
    private IO io;

    @Before
    public void init() {
        bookList = new ArrayList<String>();
        bookList.add("Head First Java");
        bookList.add("Head First Ruby");
        io = new IO();
        io.setWriter(new BufferedWriter(new StringWriter()));
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
