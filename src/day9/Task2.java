package day9;

import java.util.Scanner;

public class Task2 {
    // write a java program, where user provides prices of two items
    // and your program should calculate total price

    //input:
    // Enter price of item 1:
    // $10.9
    // Enter price of item 2:
    // $1.1

    //output:
    // Total: $12.0


    //part 2: you can add tax

    //part 3:
    //input should be like
    // Apple $1.1
    // Bread $3.0
    //output should be like
    // Total of Apple and Bread is: $4.1
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter price of item 1: " );
        String p1 = input.nextLine();

        System.out.print( "Enter price of item 2: " );
        String p2 = input.nextLine();

        p1 = p1.replace( "$", "" );
        p2 = p2.substring( 1 );

        double d1 = Double.valueOf( p1 );
        double d2 = Double.parseDouble( p2 );
        double total = d1 + d2;

        System.out.println( "Total: $" + total );

    }
}

