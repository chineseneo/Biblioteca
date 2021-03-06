package Biblioteca.IO;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/23/12
 * Time: 10:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class IO {
    private BufferedWriter writer;
    private BufferedReader reader;

    public IO()
    {
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void setWriter(BufferedWriter writer) {
        this.writer = writer;
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public void print(String message)
    {
        try {
            writer.write(message);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fatal error occured, system will abort");
            System.exit(1);
        }
    }

    public Scanner getScanner()
    {
        return new Scanner(reader);
    }
}
