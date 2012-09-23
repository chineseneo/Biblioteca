package Biblioteca.option;

import Biblioteca.IO.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
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
    private int choice;
    private IO io;

    private String successMessage = "Thank You! Enjoy the book.\n";
    private String failMessage = "Sorry we don't have that book yet.\n";
    private String requestMessage = "Please which book to reserve:\n";

    public ReserveOption(List<String> bookList, IO io)
    {
        this.bookList = bookList;
        this.io = io;
    }

    public String execute()
    {
        requestForUserChoice();
        if (choice > bookList.size())
            return failMessage;
        else
            return successMessage;
    }

    private void requestForUserChoice() {
        io.print(requestMessage);
        Scanner scanner = io.getScanner();
        choice = scanner.nextInt();
    }

    public void setSuccessMessage(String acceptMessage) {
        this.successMessage = acceptMessage;
    }

    public void setRejectMessage(String failMessage) {
        this.failMessage = failMessage;

    }
}
