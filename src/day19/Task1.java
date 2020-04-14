package day19;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        //1. way to pass array to method
//        printMax(number);
//        printMin(number);
//        printDecreasingOrder(number);
        printSum(number);
        printAverage(number);


        //2. way to pass array to method
//        printMax(new int[]{1, 90, 15, 2, 5});
    }

    // create a method that prints maximum number in given array
    public static void printMax(int[] array) {
        // write your code here
        Arrays.sort(array);
        int lastIndex = array.length - 1;
        System.out.println("Max number: " + array[lastIndex]);
    }

    // create a method that prints minimum number in given array
    public static void printMin(int[] array) {
        // write your code here
        Arrays.sort(array);
        int firstIndex = 0;
        System.out.println("Min number: " + array[firstIndex]);
    }

    //create a method that prints numbers in given array in decreasing order
    public static void printDecreasingOrder(int[] array) {
        Arrays.sort(array);

        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    //create a method that calculate and print sum of given array
    // {1,2,3}
    // sum is: 6
    public static void printSum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }

        System.out.println("Sum is: " + sum);
    }

    //create a method that calculate and print average of given array
    public static void printAverage(int[] numbers) {
        int count = numbers.length;

        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }

        double average = (double) sum / count;

        System.out.println("Average: " + average);
    }

}
