package day9;

import java.util.Scanner;

public class Task1 {
    // read number from user, using nextLine()
    // parse it to integer
    // add 100 to number
    // print the number
    //input:
    //     Enter you number:  2
    //output:
    //     Result is: 102

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.print( "Enter you number: " );
        String s = scan.nextLine();

        int num = Integer.valueOf( s ); //Integer.parseInt( s );
        num += 100; //num = num + 100;

        System.out.println( "Result is: " + num );
    }
}
