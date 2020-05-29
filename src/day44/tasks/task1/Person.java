package day44.tasks.task1;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nname: " + getName() +
                "\naddress: " + getAddress() +
                "\nphone: " + getPhoneNumber();
    }
}
