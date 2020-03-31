package day11;

import java.util.Random;
import java.util.Scanner;

public class JavaRandom {

    public static void main(String[] args) {
        //1. way
        double random = Math.random() * 10; // 0 - 10
        int generated1 = (int) random;
        System.out.println( "Math.random: " + generated1 );

        //2. way
        Scanner s = new Scanner( System.in );
        Random rand = new Random();
        int generated2 = rand.nextInt( 11 );// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        System.out.println( "Random: " + generated2 );
    }

}
