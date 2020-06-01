package day47.abstractKeyword.ex1;

public class App {

    public static void main(String[] args) {
        // abstract class cant have object
        //Shape shape = new Shape();
        //shape.getPerimeter();


        Circle circle = new Circle(5);
        System.out.println("Circle perimeter: " + circle.getPerimeter());
    }
}
