package day8;

import java.util.Scanner;

public class Task5 {
    // Write a Java program to convert temperature from Celsius to Fahrenheit degree.

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Enter temperature in Celsius:" );
        int celsius = scanner.nextInt();
        //(0°C × 9/5) + 32 = 32°F
        // c * 9/5 + 32 = f
        // f = c * 9/5 + 32;

        int fahrenheit = celsius * 9 / 5 + 32;

        System.out.println( "Converted to Fahrenheit: " + fahrenheit );

    }

}
