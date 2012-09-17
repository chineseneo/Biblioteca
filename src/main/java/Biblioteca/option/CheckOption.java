package Biblioteca.option;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/13/12
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckOption implements UserOption {
    private String checkDetailsString = "Please talk to Librarian. Thank you.\n";

    public String execute()
    {
        return checkDetailsString;
    }

    public void setCheckDetailsMessage(String checkDetailsMessage) {
        this.checkDetailsString = checkDetailsMessage;
    }
}
