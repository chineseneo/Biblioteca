package Biblioteca.option;

import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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

    @Before
    public void init() {
        bookList = new ArrayList<String>();
        bookList.add("Head First Java");
        bookList.add("Head First Ruby");
    }

    @Test
    public void shouldAcceptValidUserChoice() throws IOException
    {
        option = new ReserveOption(bookList, new ByteArrayInputStream("1".getBytes()), new ByteArrayOutputStream());
        option.setSuccessMessage(successMessage);
        assertEquals(successMessage, option.execute());
    }

    @Test
    public void shouldRejectInvalidUserChoice() throws IOException
    {
        option = new ReserveOption(bookList, new ByteArrayInputStream("3".getBytes()), new ByteArrayOutputStream());
        option.setRejectMessage(failMessage);
        assertEquals(failMessage, option.execute());
    }
}
