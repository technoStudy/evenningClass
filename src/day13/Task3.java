package day13;

import java.util.Scanner;

public class Task3 {
    // write a program to check pin code
    // run it until user enters correct pin code

    // CORRECT PIN: 9999

    // constraints: user should provide an integer

    public static void main(String[] args) {
        int correctPIN = 9999;

        Scanner input = new Scanner( System.in );
        System.out.println( "Welcome to our system, please provide a pin to enter: " );
        int userPIN = input.nextInt();

        while(userPIN != correctPIN) {
            System.out.println( "Incorrect provide a new pin: " );
            userPIN = input.nextInt();
        }

        System.out.println( "entered to system!!!" );


    }

}


//8:38
