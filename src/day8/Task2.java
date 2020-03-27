package day8;

public class Task2 {
    // Write a Java program that print the average of three integers:
    // a, b, c (a = 5, b= 3, c= 2)
    // output:
    // (a+b+c)/3 = 3.33333333333

    // part 2: provide numbers using scanner

    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;
        double result = (a + b + c) / 3.0;

        System.out.println( "Average: " + result );
    }
}
