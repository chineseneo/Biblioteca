package Biblioteca.option;

import Biblioteca.library.Book;
import Biblioteca.library.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewBookOptionTest {

    private List<Book> bookList;

    @Test
    public void shouldRenderBookList()
    {
        String bookListString="";
        for(int i = 0; i < bookList.size(); i++)
        {
            bookListString += String.valueOf(i + 1) + ". " + bookList.get(i).show() + "\n";
        }

        ViewBookOption option = new ViewBookOption(bookList);
        assertEquals(bookListString, option.execute());
    }

    @Before
    public void init() {
        bookList = new Library().getBookList();
    }
}
