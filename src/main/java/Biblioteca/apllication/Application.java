package Biblioteca.apllication;

import Biblioteca.option.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    private OutputStream outPutStream;
    private InputStream inputStream;
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
        new Application().run();
    }

    public Application() {
        setInputStream(System.in);
        setOutPutStream(System.out);
        bookList = new ArrayList<String>();
        bookList.add("Head First Java");
        bookList.add("Head First Ruby");
    }

    public void run(){
        try {
            showWelcomeMessage();
            while (true)
            {
                showMenuOption();
                executeUserOption(acceptUserOption());
            }

        } catch (IOException e) {
            System.out.println("The system met a fatal error, will exit now!");
            System.exit(1);
        }
    }

    private void executeUserOption(int choice) throws IOException{
        UserOption option;
        switch (choice)
        {
            case 1:option = new ViewOption(bookList);
                break;
            case 2:option = new ReserveOption(bookList, inputStream, outPutStream);
                break;
            case 3:option = new CheckOption();
                break;
            case 4:System.exit(0);
            default:
                return;
        }
        outPutStream.write(option.execute().getBytes());
    }

    public void setOutPutStream(OutputStream outPutStream) {
        this.outPutStream = outPutStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void showWelcomeMessage() throws IOException {
        outPutStream.write(welcomeString.getBytes());
    }

    public void showMenuOption() throws IOException {
        outPutStream.write(menuOptionString.getBytes());
    }

    public int acceptUserOption() throws IOException {
        Scanner scanner = new Scanner(inputStream);
        int choice = scanner.nextInt();
        int optionCount = getOptionCount();
        if(choice > optionCount)
            outPutStream.write(declineMessage.getBytes());
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
