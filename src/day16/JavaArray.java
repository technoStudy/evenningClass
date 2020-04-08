package day16;

public class JavaArray {

    public static void main(String[] args) {
        // how to create an array
        int[] a = new int[3]; // created integer array with size 3

        // creating array when you don't know what will be your values
        String[] names = new String[4]; // created String array with size 3
        names[0] = "John";
        names[1] = "Bob";
        names[2] = "Alice";
        names[3] = "Trudy";

        /// creating array when you know your values
        String[] students = {"Samil", "Dogan", "Hafize"};

        // to get size of array
        System.out.println( "student count: " + students.length );


    }
}
