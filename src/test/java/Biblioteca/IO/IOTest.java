package Biblioteca.IO;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/23/12
 * Time: 10:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class IOTest {
    private IO io;
    private StringWriter writer;
    private BufferedWriter bufferedWriter;
    private StringReader reader;
    private BufferedReader bufferedReader;

    @Before
    public void initIO()
    {
        io = new IO();
        writer = new StringWriter();
        bufferedWriter = new BufferedWriter(writer);
        io.setWriter(bufferedWriter);
    }

    @Test
    public void shouldPrintTheMessage()
    {
        String test = "test";
        io.print(test);
        assertThat(writer.toString(), is(test));
    }

    @Test
    public void shouldReturnScanner()
    {
        reader = new StringReader("1");
        bufferedReader = new BufferedReader(reader);
        io.setReader(bufferedReader);
        Scanner scanner = io.getScanner();
        assertThat(scanner.nextInt(), is(1));
    }
}
