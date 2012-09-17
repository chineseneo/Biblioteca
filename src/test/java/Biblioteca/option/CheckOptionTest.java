package Biblioteca.option;

import org.junit.*;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckOptionTest {
    private String checkDetailsString = "Please talk to Librarian. Thank you.";

    @Test
    public void shouldRenderCheckMessage()
    {
        CheckOption option = new CheckOption();
        option.setCheckDetailsMessage(checkDetailsString);
        assertEquals(checkDetailsString, option.execute());
    }
}
