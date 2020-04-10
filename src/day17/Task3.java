package day17;

import java.util.Arrays;

public class Task3 {
    //Write a Java program to copy an array by iterating the array
    // firstArray = {1, 2, 3, 4, 5}
    // secondArray = empty;

    // copy
    // secondArray = {1, 2, 3, 4, 5}

    public static void main(String[] args) {
        int[] firstArray = {99, 1, 2, 3, 4, 5, 9};
        int[] secondArray = new int[firstArray.length];

        System.out.println( "firstArray : " + Arrays.toString( firstArray ) );
        System.out.println( "before copy: " + Arrays.toString( secondArray ) );
        for(int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }


        System.out.println( "after copy: " + Arrays.toString( secondArray ) );

    }
}
