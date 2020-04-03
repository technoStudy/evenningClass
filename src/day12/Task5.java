package day12;

import java.util.Scanner;

public class Task5 {
    // Write a Java program that takes a year from user
    // and print whether that year is a leap year or not.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = input.nextInt();
        String checkleap="";
        if (year%4==0){
            if (year%100!=0){
                if (year%400!=0){
                    checkleap = " is";
                }
                else if (year%400==0){
                    checkleap = " is";
                }
            }
        }
        else{
            checkleap=" is not";
        }
        System.out.println(year + checkleap + " a leap year" );
    }
}
