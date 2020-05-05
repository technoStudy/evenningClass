package day30.tasks.task2;

//create a class Bank, in different file
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
public class Bank {
    String name;
    int serial;
    boolean trustworthiness;

    Bank() {
        name = "Falcon Dogan Bank";
    }

    Bank(String name, int serial) {
        this.name = name;
        this.serial = serial;

        this.trustworthiness = false;
    }

    Bank(String name, int serial, boolean trustworthiness) {
        this.name = name;
        this.serial = serial;
        this.trustworthiness = trustworthiness;
    }

    @Override
    public String toString() {
        return "\n----------------------------" +
                "\nname: '" + name + '\'' +
                "\nserial: " + serial +
                "\ntrustworthiness: " + trustworthiness +
                "\n----------------------------";
    }
}
