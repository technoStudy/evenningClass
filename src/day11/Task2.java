package day11;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    // Let user provide a number between 0 and 3
    // then generate a random number between 0 and 3
    // and check if provided number is equal to generated number
    // if they are equal print out "You Won the Game!!!"
    // else "Game Over!!!"
    ///    "Number was: {generated number}"

    // step 1: use scanner to read from user
    // step 2: use random to generate the random number
    // step 3: check user number and generated number
    ///        if they are equal print => "You Won the Game!!!"
    ///        if they are not equal print => "Game Over!!!"
    //    ///                                 "Number was: {generated number}"

    public static void main(String[] args) {
        // step 1: use scanner to read from user
        Scanner input = new Scanner( System.in );

        System.out.println( "Welcome to Guess a Number game!!!" );
        System.out.print( "Provide a number between 0-3: " );
        int userNumber = input.nextInt();










        // step 2: use Random to generate the random number
        Random random = new Random();
        int generatedNumber = random.nextInt( 4 ); // 0,1,2,3














        // step 3: check user number and generated number
//        if(userNumber == generatedNumber) {
//            System.out.println( "You won the game!!!" );
//        } else {
//            System.out.println( "Game Over!!!" );
//            System.out.println( "Number was: " + generatedNumber );
//        }

        System.out.println(userNumber == generatedNumber
                ? "You won the game!!!"
                : "Game Over!!!" + "\nNumber was: " + generatedNumber);

    }

}