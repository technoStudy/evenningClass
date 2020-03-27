package day8;

import java.util.Scanner;

public class Task4 {
    // Write a Java program that reads a number and display the square, cube

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println( "Provide number please: " );
        int num = scan.nextInt();

        // 1. way
        int square = num * num;
        System.out.println( "Square of " + num + " is: " + square );
        int cube = square * num;
        System.out.println( "Cube of " + num + " is: " + cube );

        // 2. way
        int result = num;
        result*=num;
        System.out.println( "Square of " + num + " is: " + result );

        result*=num;
        System.out.println( "Cube of " + num + " is: " + result );
    }
}
