package day30.example.example2;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    public Car(int x, int y){
        this("super model");
    }

    public void print() {
        String model = "Ford";
        System.out.println("My car model is: " + model);
        System.out.println("but actually it is: " + this.model);
    }

}
