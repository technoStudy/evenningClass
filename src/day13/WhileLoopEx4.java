package day13;

import java.util.Scanner;

public class WhileLoopEx4 {
    // write program which checks if provide hacking code is correct

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        String hacks = input.nextLine();
        while(hacks.length() < 10) {
            System.out.println( "Breaching the network..." );
            hacks = input.nextLine();
        }

        System.out.println( "Hacking is over, police get you" );


    }


}
