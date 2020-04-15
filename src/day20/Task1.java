package day20;

public class Task1 {
    // print various numbers of different datatypes
    // by creating different methods with the same name 'printn'
    // having a parameter for each datatype.

    // datatypes: int, double, float, byte, long
    public static void printn(int n) {
        System.out.println("Your integer number is: " + n);
    }

    public static void printn(double n) {
        System.out.println("Your double number is: " + n);
    }

    public static void printn(float n) {
        System.out.println("Your float number is: " + n);
    }

    public static void printn(byte n) {
        System.out.println("Your byte number is: " + n);
    }

    public static void printn(long n) {
        System.out.println("Your long number is: " + n);
    }

    public static void main(String[] args) {
        printn(1);
        printn(2d);
        printn(3f);
        printn((byte)4);
        printn(5L);
    }


}
