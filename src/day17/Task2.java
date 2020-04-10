package day17;

import java.util.Arrays;

public class Task2 {
    //Write a Java program to find the maximum and minimum value of an int array.

    public static void main(String[] args) {
        // 1.way
        int[] numbers = {3, 9, 6, 1, 7, 3, 8, 5};
        Arrays.sort( numbers );
        int min = numbers[0];
        int max = numbers[numbers.length - 1];

    }

}
