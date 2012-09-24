package Biblioteca.library;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {

    @Test
    public void shouldShowBookInfo()
    {
        String bookName = "Head First Java";
        String bookAuthor = "Sierra & Bates";
        String bookPrice = "79.00";
        String expectedBookShow = bookName + " - " +
                bookAuthor + " - " +
                bookPrice;
        Book book = new Book(bookName, bookAuthor, bookPrice);
        assertThat(book.show(), is(expectedBookShow));
    }
}
