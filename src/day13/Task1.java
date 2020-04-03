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
        while(i <= lastNumber) { //4. 3 <= 2
            result += i; // 0 1 2 3 4 ... lastNumber
            //           (result,  i)
            //1. result = 0 + 0; = 0
            //2. result = 0 + 1; = 1
            //3. result = 1 + 2; = 3
            //4. i = ?

            i++;


        }

        System.out.println( "sum is: " + result );


    }
}
