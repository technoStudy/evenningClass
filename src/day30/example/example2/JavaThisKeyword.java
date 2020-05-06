package day30.example.example2;


public class JavaThisKeyword {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        car1.model = "model";
//        this.clone();
        car1.print();
    }
}
