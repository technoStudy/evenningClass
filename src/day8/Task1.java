package day8;

import java.util.Scanner;

public class Task1 {
    // Write a Java program that multiplies four integers and  print result

    //part 2: use scanner to provide numbers

    public static void main(String[] args) {
//        part1
//        int a = 1, b = 2, c = 3, d = 4;
//        int result = a * b * c * d;
//        System.out.println( "Result: " + result );

        //part 2
        Scanner scan = new Scanner( System.in );
        System.out.println("Provide number for a: ");
        int a = scan.nextInt();

        System.out.println("Provide number for b: ");
        int b = scan.nextInt();

        System.out.println("Provide number for c: ");
        int c = scan.nextInt();

        System.out.println("Provide number for d: ");
        int d = scan.nextInt();

        int result = a * b * c * d;
        System.out.println( "Result: " + result );

    }

}
