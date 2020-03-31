package day10;

import java.util.Scanner;

public class elseIfStatement {

    public static void main(String[] args) {

            /*

        Is it same like nested if statement?

            if there is a if statement in the if statement then it will call as a nested if statement
         */

        Scanner dp = new Scanner(System.in);

        int num = dp.nextInt();

        if(num>10){

            if(num<30 ){

                System.out.println("number is more then 10 and less then 30");

            }else if(num < 40){

                System.out.println("number is more then 10 and less then 40 ");

            }


        }else if(num > 5){

            System.out.println("number is more then 5 ");
        }

    }
}
