package Biblioteca.option;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewOptionTest {
    @Test
    public void shouldRenderBookList()
    {
        List<String> bookList = new ArrayList<String>();
        bookList.add("Head First Java");
        bookList.add("Head First Ruby");

        String bookListString="";
        for(int i = 0; i < bookList.size(); i++)
        {
            bookListString += String.valueOf(i + 1) + ". " + bookList.get(i) + "\n";
        }

        ViewOption option = new ViewOption(bookList);
        assertEquals(bookListString, option.execute());
    }
}
