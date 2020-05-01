package day29.example;

import java.util.Random;

public class JavaStaticAndNonStaticMethods {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 5;

        // to use non-static/instance method we have to have an object/instance
        int area = rectangle.getArea();
        System.out.println("Area: " + area);
        //example from build-in method in java
        new Random().nextInt(5);


        // to use static method we dont need an object/instance
        Rectangle square = createSquare(5);
        //example from build-in method in java
        Math.random();


        int absoluteNumber = MyMath.abs(-100);
        System.out.println("Absolute of -100: " + absoluteNumber);

    }

    public static Rectangle createSquare(int side) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = side;
        rectangle.width = side;

        return rectangle;
    }
}
