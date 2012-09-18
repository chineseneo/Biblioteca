package Biblioteca.option;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReserveOption implements UserOption {

    private List<String> bookList;
    private InputStream inputStream;
    private OutputStream outputStream;
    private int choice;

    private String successMessage = "Thank You! Enjoy the book.\n";
    private String failMessage = "Sorry we don't have that book yet.\n";
    private String requestMessage = "Please which book to reserve:\n";

    public ReserveOption(List<String> bookList, InputStream in, OutputStream out)
    {
        this.bookList = bookList;
        this.inputStream = in;
        this.outputStream = out;
    }

    public String execute() throws IOException
    {
        requestForUserChoice();
        if (choice > bookList.size())
            return failMessage;
        else
            return successMessage;
    }

    private void requestForUserChoice() throws IOException{
        outputStream.write(requestMessage.getBytes());
        Scanner scanner = new Scanner(inputStream);
        choice = scanner.nextInt();
    }

    public void setSuccessMessage(String acceptMessage) {
        this.successMessage = acceptMessage;
    }

    public void setRejectMessage(String failMessage) {
        this.failMessage = failMessage;

    }
}
