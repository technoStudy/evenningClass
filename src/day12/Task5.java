package day12;

import java.util.Scanner;

public class Task5 {
    // Write a Java program that takes a year from user
    // and print whether that year is a leap year or not.

    public static void main(String[] args) {

        int year;    // holds a year

        // Create a Scanner object for keyboard input.
        Scanner in = new Scanner( System.in );

        // Get the year.
        System.out.print( "Enter a year : " );
        year = in.nextInt();

        // Determine whether the year is leap year.
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println( "A leap year" );
                } else {
                    System.out.println( "Not a leap year" );
                }
            } else {
                System.out.println( "A leap year" );
            }
        } else {
            System.out.println( "Not a leap year" );
        }
    }
}
