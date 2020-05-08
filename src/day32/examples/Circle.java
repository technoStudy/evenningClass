package day32.examples;

import java.util.Arrays;

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Constants.pi * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        circle1.getArea();

//        Circle.print();

//        Arrays.sort(array);
//        Math.min(1,3);
//        Math.random();
    }

}
