package day10;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);

        System.out.println("How many rooms do you need? ");
        int roomCount = dp.nextInt();

        if(roomCount>3){
            System.out.println("we dont have any apartments more then 3 rooms");

        }else if(roomCount == 3){
            System.out.println("Rent is 2500");

        }else if(roomCount == 2){
            System.out.println("Rent is 2000");

        }else if(roomCount == 1){
            System.out.println("Rent is 1500");

        }else if(roomCount == 0){
            System.out.println("Rent is 1100");

        }

//            THIS ONE IS ALSO OTHER TO SOLVE THE QUESTION
//        int rent = 0;
//        if(roomCount>3){
//            System.out.println("we dont have any apartments more then 3 rooms");
//
//        }else if(roomCount == 3){
//            rent = 2500;
//
//        }else if(roomCount == 2){
//            rent = 2000;
//
//        }else if(roomCount == 1){
//            rent = 1500;
//
//        }else if(roomCount == 0){
//            rent = 1300;
//        }
//
//        System.out.println("Your rent will be " + rent );

    }

        
    }

