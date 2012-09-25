package Biblioteca.library;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/25/12
 * Time: 10:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    @Test
    public void shouldReturnID()
    {
        String ID = "111-1111";
        String password = "pw";
        User user = new User(ID, password);
        assertThat(user.ID(), is(ID));
    }


}
