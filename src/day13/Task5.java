package day13;

import java.util.Scanner;

public class Task5 {
    // write program which checks if provide hacking code is correct
    // use do-while

    public static void main(String[] args) {
        String hacks;
        Scanner input = new Scanner( System.in );

        System.out.println("Welcome to hacking tutorial!!!");

        do {
            hacks = input.nextLine();
            System.out.println( "Breaching the network..." );
        } while(hacks.length() < 10);

        System.out.println( "Hacking is over, police get you" );

    }

}
