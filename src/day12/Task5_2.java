package day12;

import java.util.Scanner;

public class Task5_2 {
    // Write a Java program that takes a year from user
    // and print whether that year is a leap year or not.

    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );

        System.out.print( "Input the year: " );
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y || z)) {
            System.out.println( year + " is a leap year" );
        } else {
            System.out.println( year + " is not a leap year" );
        }
    }


}
