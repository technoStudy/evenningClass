package day10;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first String");

        String name1 = input.nextLine();

        System.out.println("Enter second String");

        String name2 = input.nextLine();

        int total = name1.length() + name2.length();


        if (total > 15) {

            System.out.println("your string are too long");
        }

        if (total < 15) {

            System.out.println("your string are okay");
        }

    }
}
