package day16;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    // create an array with size 10
    // populate(fill) your array with random numbers using Random or Math.random()

    public static void main(String[] args) {
        //step 1: create array with size 10
        int[] randomNumbers = new int[10];

        //step 2: create random class to get random numbers
        Random rand = new Random();

        for(int index = 0; index < randomNumbers.length; index++) {
            randomNumbers[index] = rand.nextInt( 100 );
        }


        System.out.println( Arrays.toString( randomNumbers ) );
    }
}
