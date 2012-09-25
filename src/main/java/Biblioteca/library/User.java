package Biblioteca.library;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/25/12
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String ID;
    private String password;

    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    public String ID() {
        return ID;  //To change body of created methods use File | Settings | File Templates.
    }
}
