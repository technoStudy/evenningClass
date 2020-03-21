package day5;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner( System.in );

//  create one int and enter your monthly spend print the number.

        System.out.println("Enter your montly spend");

        int montlySpend = s1.nextInt();

        System.out.println("your montly spend is " + montlySpend);

//      String , int

//      double

        System.out.println("Enter monthly spend in decimal ");

        double montlySpendDouble = s1.nextDouble();

        System.out.println("your monthly spend in decimal " + montlySpendDouble);

//      create one double and which is salary and print that salary

        System.out.println("Enter your salary");

        double salary = s1.nextDouble();

        System.out.println("Your salary is " + salary);


    }
}
