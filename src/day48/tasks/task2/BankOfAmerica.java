package day48.tasks.task2;

public class BankOfAmerica extends AbstractBank {

    public BankOfAmerica(String name, String phoneNumber, String address, int numberOfEmployees) {
        super(name, phoneNumber, address, numberOfEmployees);
    }

    @Override
    public void openAccount() {
        System.out.println("signature");
    }

    @Override
    public void closeAccount() {
        System.out.println("signature");
    }
}
