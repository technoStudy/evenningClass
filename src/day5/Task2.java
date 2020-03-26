package day5;

import java.util.Scanner;

public class Task2 {
    // create java application that sums two integers from user
    // and show result

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println( "First number: " );
        int a = scan.nextInt();

        System.out.println( "Second number: " );
        int b = scan.nextInt();

        int sum = a + b;
        System.out.println( "Sum is " + sum );


        System.out.println( "1. Sum is: " + a + b ); //
        System.out.println( "2. Sum is: " + (a + b) ); //
    }

}
