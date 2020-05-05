package day30.tasks.task2;

//create a class Bank, in different file
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
public class Bank {
    String name;
    int serial;
    String address;

    boolean isClosed;

    //1. Constructor: default -> no parameters
    Bank() {
        name = "Falcon Dogan Bank";

    }

    //2. Constructor: with 2 parameters
    Bank(String name, int serial) {
        this.name = name;
        this.serial = serial;
        this.address = "Not defined";
        this.isClosed = true;
    }

    //3.  Constructor: with 3 parameters
    Bank(String name, int serial, boolean isClosed) {
        this.name = name;
        this.serial = serial;
        this.isClosed = isClosed;
    }

    @Override
    public String toString() {
        return "\n----------------------------" +
                "\nname: '" + name + '\'' +
                "\nserial: " + serial +
                "\nisClosed: " + isClosed +
                "\naddress: " + address +
                "\n----------------------------";
    }
}
