package day16;

public class Task2 {
    // Write a Java program to sum values of an array
    // constraints: size should be 5
    // {10, 10, 30, 40, 10} => 100

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 10;
        array[2] = 30;
        array[3] = 40;
        array[4] = 10;


        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println( "Sum is: " + sum );


    }
}
