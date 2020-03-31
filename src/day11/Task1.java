package day11;

import java.util.Random;

public class Task1 {
    // generate a random number between 0 and 5

    // part 2
    // generate a random number between 5 and 10

    public static void main(String[] args) {
        int low = 0;
        int high = 5;

        Random random = new Random();
        int zeroToFive = random.nextInt( high + 1 );// 0,1,2,3,4,5

        System.out.println( "0-5: " + zeroToFive );
        System.out.println( "5-10: " + (zeroToFive + 5) );

        /*
        int min = 5;
        int max = 10;
        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;
        */
    }

}
