package Biblioteca.application;

import Biblioteca.apllication.Application;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationTest {


    private OutputStream out;
    private InputStream in;
    private Application application;

    private String wantedMenuOptionString = "1. View all books\n" +
            "2. Reserve a book\n" +
            "3. check details";
    private String invalidOption = "4";
    private String wantedDeclineString = "Select a valid option!!\n";
    private String welcomeMessage = "Welcome\n";

    @Test
    public void shouldGiveWelcomeMessage() throws IOException
    {
        application.showWelcomeMessage();
        assertEquals(welcomeMessage, out.toString());
    }

    @Test
    public void shouldGiveMenuOption() throws IOException
    {

        application.setMenuOptionString(wantedMenuOptionString);
        application.showMenuOption();
        assertEquals(wantedMenuOptionString, out.toString());
    }

    @Test
    public void shouldDeclineInvalidUserOption() throws IOException
    {
        in = new ByteArrayInputStream(invalidOption.getBytes());
        application.setInputStream(in);
        application.acceptUserOption();
        assertEquals(wantedDeclineString, out.toString());
    }

    @Before
    public void initApplication() {
        out = new ByteArrayOutputStream();
        application = new Application();
        application.setOutPutStream(out);
        application.setMenuOptionString(wantedMenuOptionString);
        application.setDeclineMessage(wantedDeclineString);
        application.setWelcomeMessage(welcomeMessage);

    }
}
