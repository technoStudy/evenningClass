package day13;

import java.util.Scanner;

public class Task4 {
    // write a program to check pin code
    // run it until user enters correct pin code

    // CORRECT PIN: 9999

    // constraints: user should provide an integer
    //              use do-while loop

    public static void main(String[] args) {
        int userPin;
        int correctPin = 9999;

        Scanner input = new Scanner( System.in );

        System.out.println( "Welcome to our system!!!" );

        do {
            System.out.println( "Enter you pin: " );
            userPin = input.nextInt();
        } while(userPin != correctPin);

        System.out.println( "Entered to system" );

    }

}


