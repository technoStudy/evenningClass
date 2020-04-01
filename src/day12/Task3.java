package day12;

import java.util.Scanner;

public class Task3 {
    /*
    // Write a Java program to input week day and print day number
    "Monday" = > 1
    "Tuesday" => 2
    "Wednesday" => 3
    "Thursday" => 4
    "Friday" => 5
    "Saturday" => 6
    "Sunday" => 7

    in other input => "not a valid week day"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        System.out.println( "Please enter day of the week: " );
        String day = scan.nextLine();
        day = day.toUpperCase();

        String dayNumber = "";
        switch(day) {
            case "MONDAY":
                dayNumber = "1";
                break;
            case "TUESDAY":
                dayNumber = "2";
                break;
            case "WEDNESDAY":
                dayNumber = "3";
                break;
            case "THURSDAY":
                dayNumber = "4";
                break;
            case "FRIDAY":
                dayNumber = "5";
                break;
            case "SATURDAY":
                dayNumber = "6";
                break;
            case "SUNDAY":
                dayNumber = "7";
                break;
            default:
                dayNumber = "Not a valid week day";
                break;
        }

        System.out.println( dayNumber );

    }

}
