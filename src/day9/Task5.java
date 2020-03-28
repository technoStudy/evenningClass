package day9;

import java.util.Scanner;

public class Task5 {
    // Take two numbers from the user and print the greatest number

    // input:
//    first number: 10
//    second number : 50

//    output
//    greatest number is: 50

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.print( "num 1: " );
        int num1 = scan.nextInt();

        System.out.print( "num 2: " );
        int num2 = scan.nextInt();

        if(num1 >= num2) {
            System.out.println( num1 );
        }

        if(num1 < num2) {
            System.out.println( num2 );
        }

    }
}
