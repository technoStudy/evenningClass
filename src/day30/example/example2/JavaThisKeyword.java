package day30.example.example2;


class Car {
    String model;

    public Car(String m) {
        model = m;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}

public class JavaThisKeyword {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        System.out.println(car1);
    }
}
