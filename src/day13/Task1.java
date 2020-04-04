package day13;

import java.util.Scanner;

public class Task1 {
    // Ask user to provide last number;
    // calculate sum of numbers between 0 and last number

    // ex:        provided number: 2
    // output:    3

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println( "Provide a number, please:" );

        int lastNumber = input.nextInt();


        int result = 0;

        int i = 0;
        while(i <= lastNumber) {
            result += i;
            i++;
        }
        System.out.println( "sum is: " + result );


    }
}
