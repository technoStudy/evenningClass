package day44.inheritanceNonAccessModifier.finalModifierField.ex2;

public class Car extends Vehicle {


    public Car(String model) {
        super(model);
    }

    public static void main(String[] args) {
        Car toyota = new Car("Toyota");
//        toyota.model = "Toyota";
//        toyota.model = "Nissan";
        //toyota.model = "Nissan";

        System.out.println(toyota);
    }


    @Override
    public String toString() {
        return "Car: " + model;
    }
}
