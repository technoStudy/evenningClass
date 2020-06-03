package day48.tasks.task2;

public abstract class AbstractBank {
    private String name;
    private String phoneNumber;
    private String address;
    private int numberOfEmployees;

    public AbstractBank(String name, String phoneNumber, String address, int numberOfEmployees) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
    }

    public abstract void openAccount();

    public abstract void closeAccount();

    public String withdraw(double amount) {
        return "withdraw money $" + amount;
    }

    public String deposit(double amount) {
        return "deposit money $" + amount;
    }

    @Override
    public String toString() {
        return "AbstractBank{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }


}
