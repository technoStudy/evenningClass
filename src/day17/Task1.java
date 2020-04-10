package day17;

import java.util.Random;

public class Task1 {
    //Fill array with random values using Random/Math.random, 0 <= random N <= 10
    // int, size = 10
    //output: print array in one line
    //part2. check if an array of has 0, print => "it has zero"
    //part3. check if array has 10, print => "it has 10"
    //part4. check if array has 0 and 10, print => "it has zero and ten"

    public static void main(String[] args) {
        //part1
        System.out.println( "Part 1 ----------------------------------" );
        Random random = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt( 11 );
        }
        //1.way to print
//        System.out.println( Arrays.toString( numbers ) );
//        //2.way to print
        for(int number : numbers) {
            System.out.print( number + " " );
        }

        //part2. check if an array of has 0, print => "it has zero"
        System.out.println( "\n\nPart 2 ----------------------------------" );
        for(int number : numbers) {
            if(number == 0) {
                System.out.println( "it has zero" );
            }
        }
        //part3. check if an array of has 10, print => "it has ten"
        System.out.println( "\nPart 3 ----------------------------------" );
        for(int number : numbers) {
            if(number == 10) {
                System.out.println( "it has ten" );
            }
        }

        //part4. check if array has 0 and 10, print => "it has zero and ten"
        System.out.println( "\nPart 4 1.way ----------------------------------" );
        //1.way
        int zeroCounter = 0;
        int tenCounter = 0;
        for(int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if(number == 0) {
                zeroCounter++;
            } else if(number == 10) {
                tenCounter++;
            }
        }

        boolean haveZeroAndTenInArray = zeroCounter > 0 && tenCounter > 0;
        if(haveZeroAndTenInArray) {
            System.out.println( "it has zero and ten" );
        }

        //2.way
        //part4. check if array has 0 and 10, print => "it has zero and ten"
        System.out.println( "\nPart 4 2.way ----------------------------------" );
        boolean hasZero = false;
        boolean hasTen = false;

        for(int number : numbers) {
            if(number == 0){
                hasZero = true;
            }else if(number == 10){
                hasTen = true;
            }
        }

        boolean hasZeroAndTen = hasZero && hasTen;
        if(hasZeroAndTen) {
            System.out.println( "it has zero and ten" );
        }


    }
}
