package day10;

import java.util.Scanner;

public class task3 {

    /*
        Task 3

        create two ints

        Find the reminder from first to second one

        if First one should be bigger then second one

        if the reminder is 4
                print num 1 divide by num 2 is 4

        else if the reminder is 3
                print num 1 divide by num 2 is 3

        else if the reminder is 2
                print num 1 divide by num 2 is 2

         else if the reminder is 1
                print num 1 divide by num 2 is 1

        else if the reminder is 0
                print num 1 divide by num 2 is 0

         */
    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = dp.nextInt();

        System.out.println("Enter num2");
        int num2 = dp.nextInt();

        int reminder = num1%num2;

        if(num2>num1){
            System.out.println("this is not a valid numbers num2 should be smaller then num1");

        }else if(reminder==4){
            System.out.println(num1 +" divide by " +num2 +" is 4");

        }else if(reminder==3){
            System.out.println(num1 +" divide by " +num2 +" is 3");

        }else if(reminder==2){
            System.out.println(num1+" divide by " + num2 + " is 2");

        }else if (reminder ==1 ){
            System.out.println(num1 + " divide by " + num2 + " is 1 ");

        }else if(reminder ==0){
            System.out.println(num1 + " divide by " + num2 + " is 0");
        }

    }
    }

