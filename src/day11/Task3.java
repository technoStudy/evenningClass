package day11;

import java.util.Scanner;

public class Task3 {
    /*
    Write a Java program to calculate profit or loss
    Input:
        cost price: 1000
        selling price: 1500
    Output:
        1500-1000 = 500
        Profit: 500
------------------------------------------------------
    Input 2:
        cost price: 5000
        selling price: 2000
    Output:
        2000 - 5000 = -3000
        Loss: 3000
     */


    // step 4: use Math.abs to get positive number for Loss

    public static void main(String[] args) {
        // step 1: use scanner to get cost and selling prices from user
        Scanner input = new Scanner( System.in );

        System.out.print( "Cost price: $" );
        int costPrice = input.nextInt();

        System.out.print( "Selling price: $" );
        int sellingPrice = input.nextInt();


        // step 2: calculate outcome; outcome = selling price - cost price
        int outcome = sellingPrice - costPrice;
        System.out.println( "outcome: " + outcome );

        // step 3: check outcome
        //               outcome >= 0 Profit
        //               outcome < 0 Loss
//        if(outcome >= 0) {
//            System.out.println( "Profit: " + outcome );
//        } else { // outcome < 0
//            System.out.println( "Loss: " + Math.abs( outcome ) );
////            System.out.println( "Loss: " + (-outcome) ); // -(-1) = 1
//        }

        String profitOrLoss = (outcome >= 0) ? "Profit: " : "Loss: ";

        System.out.println(profitOrLoss + Math.abs( outcome ));


    }

}
