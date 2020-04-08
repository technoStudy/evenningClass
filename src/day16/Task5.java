package day16;

import java.util.Scanner;

public class Task5 {
    //create an array of vegetables with size 5
    //provide names of vegetable using scanner
    // print them in one line using for-each loop

    //ex: Enter vegetable name: Tomato
    //    Enter vegetable name: Potato

    // Vegetables: Tomato, Potato

    // Hint: scanner, for, foreach, print

    public static void main(String[] args) {
        int size = 5;
        String[] vegetables = new String[size];

        Scanner input = new Scanner( System.in );
        for(int i = 0; i < size; i++) {
            System.out.print( "Enter vegetable name: " );
            String name = input.nextLine();

            vegetables[i] = name;
        }


        System.out.print( "Vegetables: " );
        for(String vegetable : vegetables) {
            System.out.print( vegetable + ", " );
        }

    }

}
