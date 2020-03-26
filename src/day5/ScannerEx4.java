package day5;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner( System.in );
        //  create one int and enter your monthly spend print the number.

        System.out.println( "Enter your monthly spend" );
        int monthlySpend = s1.nextInt();

        System.out.println( "your monthly spend is " + monthlySpend );

//      String , int
//      double

        System.out.println( "Enter monthly spend in decimal " );
        double monthlySpendDouble = s1.nextDouble();

        System.out.println( "your monthly spend in decimal " + monthlySpendDouble );
//      create one double and which is salary and print that salary

        System.out.println( "Enter your salary" );
        double salary = s1.nextDouble();

        System.out.println( "Your salary is " + salary );

    }
}
