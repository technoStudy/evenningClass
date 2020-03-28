package day9;

import java.util.Scanner;

public class Task4 {
    // Write a Java program to get a number from the user
    // and print whether it is positive or negative

    // ex: 10 -> positive
    // ex1: -5 -> negative

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.print( "Provide a number: " );
        double number = input.nextDouble();

        if(number > 0) {
            System.out.println( "Positive!!!" );
        }

        if(number < 0) {
            System.out.println( "Negative!!!" );
        }

        if(number == 0) {
            System.out.println( "You have zero" );
        }

    }

}
