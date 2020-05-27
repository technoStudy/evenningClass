package day43.superKeyword.ex2;

public class Vehicle extends Object {

    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}
