package Biblioteca.option;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewOption implements UserOption {
    List<String> bookList;

    public ViewOption(List<String> bookList)
    {
        this.bookList = bookList;
    }

    public String execute()
    {
        String bookListString = "";
        for (int i = 0; i < bookList.size(); i++)
        {
            bookListString += String.valueOf(i + 1) + ". " + bookList.get(i) + "\n";
        }

        return bookListString;
    }
}
