package day29.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class JavaStaticAndNonStaticMethods {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        int area = rectangle1.getArea();

        Rectangle rectangle = Rectangle.createRectangle(10, 5);
        Rectangle square = Rectangle.createSquare(5);


        //example of static method
        Math.abs(10);
        Math.random();
        //Arrays.sort();
        //Collections.max()


        //example of non-static/instance method
        Random random = new Random();
        random.nextDouble();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();




    }



}
