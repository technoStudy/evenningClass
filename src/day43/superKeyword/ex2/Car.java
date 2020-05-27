package day43.superKeyword.ex2;

public class Car extends Vehicle {

    public Car(String model) {
        super(model);
    }

    @Override
    public String toString() {
        return "Car " + super.toString();
    }
}
