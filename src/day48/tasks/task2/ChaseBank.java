package day48.tasks.task2;

public class ChaseBank extends AbstractBank {

    public ChaseBank(String name, String phoneNumber, String address, int numberOfEmployees) {
        super(name, phoneNumber, address, numberOfEmployees);
    }

    @Override
    public void openAccount() {
        System.out.println("ssn, driver license, photo, signature");
    }

    @Override
    public void closeAccount() {
        System.out.println("ssn, driver license, photo, signature");
    }
}
