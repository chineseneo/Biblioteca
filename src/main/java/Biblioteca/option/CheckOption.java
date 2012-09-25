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
    private String number;

    public CheckOption(String number) {
        this.number = number;
    }

    public CheckOption() {
        this.number = null;
    }

    public String execute()
    {
        return this.number == null ? checkDetailsString : (number + "\n");
    }

    public void setCheckDetailsMessage(String checkDetailsMessage) {
        this.checkDetailsString = checkDetailsMessage;
    }
}
