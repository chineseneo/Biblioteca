package Biblioteca.apllication;

import Biblioteca.IO.IO;
import Biblioteca.option.CheckOption;
import Biblioteca.option.ReserveOption;
import Biblioteca.option.UserOption;
import Biblioteca.option.ViewOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    IO io;
    private String welcomeString = "Welcome to the Biblioteca system!\n";
    private String menuOptionString = "\nValid options are:\n" +
            "1. View all books\n" +
            "2. Reserve a book\n" +
            "3. check details\n" +
            "4. exit\n" +
            "Please make a choice:\n";
    private String declineMessage = "Select a valid option!!\n";
    private List<String> bookList;

    public static void main(String[] args)
    {
        IO io = new IO();
        new Application(io).run();
    }

    public Application(IO io) {
        this.io = io;
        bookList = new ArrayList<String>();
        bookList.add("Head First Java");
        bookList.add("Head First Ruby");
    }

    public void run(){
            showWelcomeMessage();
        boolean continueFlag = true;
        while (continueFlag) {
            showMenuOption();
            continueFlag = executeUserOption(acceptUserOption());
        }
    }

    private boolean executeUserOption(int choice) {
        UserOption option;
        switch (choice)
        {
            case 1:
                option = new ViewOption(bookList);
                break;
            case 2:
                option = new ReserveOption(bookList, io);
                break;
            case 3:
                option = new CheckOption();
                break;
            default:
                return false;
        }
        io.print(option.execute());
        return true;
    }

    public void showWelcomeMessage()  {
        io.print(welcomeString);
    }

    public void showMenuOption()  {
        io.print(menuOptionString);
    }

    public int acceptUserOption()  {
        Scanner scanner = io.getScanner();
        int choice = scanner.nextInt();
        int optionCount = getOptionCount();
        if(choice > optionCount)
            io.print(declineMessage);
        return choice;
    }

    private int getOptionCount() {
        int optionCount = 0;
        for(int i = 0; i < menuOptionString.length(); i++)
        {
            if (Character.isDigit(menuOptionString.charAt(i)))
            {
                optionCount++;
            }
        }
        return optionCount;
    }


    public void setMenuOptionString(String menuOptionString) {
        this.menuOptionString = menuOptionString;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeString = welcomeMessage;
    }

    public void setDeclineMessage(String declineString) {
        this.declineMessage = declineString;
    }
}
