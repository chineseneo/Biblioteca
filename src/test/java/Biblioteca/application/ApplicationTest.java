package Biblioteca.application;

import Biblioteca.IO.IO;
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


    private StringWriter writer;
    private BufferedWriter bufferedWriter;
    private StringReader reader;
    private BufferedReader bufferedReader;
    private IO io;
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
        assertEquals(welcomeMessage, writer.toString());
    }

    @Test
    public void shouldGiveMenuOption() throws IOException
    {

        application.setMenuOptionString(wantedMenuOptionString);
        application.showMenuOption();
        assertEquals(wantedMenuOptionString, writer.toString());
    }

    @Test
    public void shouldDeclineInvalidUserOption() throws IOException
    {
        reader = new StringReader(invalidOption);
        bufferedReader = new BufferedReader(reader);
        io.setReader(bufferedReader);
        application.acceptUserOption();
        assertEquals(wantedDeclineString, writer.toString());
    }

    @Before
    public void initApplication() throws IOException{
        io = new IO();
        writer = new StringWriter();
        bufferedWriter = new BufferedWriter(writer);
        io.setWriter(bufferedWriter);
        application = new Application(io);
        application.setMenuOptionString(wantedMenuOptionString);
        application.setDeclineMessage(wantedDeclineString);
        application.setWelcomeMessage(welcomeMessage);

    }
}
