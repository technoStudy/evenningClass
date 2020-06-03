package day48.tasks.task2;

public class WellsFargo extends AbstractBank {

    public WellsFargo(String name, String phoneNumber, String address, int numberOfEmployees) {
        super(name, phoneNumber, address, numberOfEmployees);
    }

    @Override
    public void openAccount() {
        System.out.println("ssn, signature, US citizen");

    }

    @Override
    public void closeAccount() {
        System.out.println("ssn, signature, US citizen");
    }
}
