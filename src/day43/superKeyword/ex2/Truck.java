package day43.superKeyword.ex2;

public class Truck extends Vehicle {

    public Truck(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return "Truck " + super.toString();
    }
}
