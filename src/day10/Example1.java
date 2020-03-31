package day10;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your budget.");
        int budget = input.nextInt();

        if (budget > 7500){
            System.out.println("you can travel anywhere in the world");

        }else if (budget<7500 && budget >5000){
            System.out.println("you can travel anywhere except Austrlia");


        }else if (budget < 5000 && budget >3000){
            System.out.println("You can travel US and EUROPE");
        }else if (budget < 3000){
            System.out.println("stay at home");
        }
    }
}
