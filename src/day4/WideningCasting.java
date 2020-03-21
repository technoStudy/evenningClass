package day4;

/*
Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
 */
public class WideningCasting {

    public static void main(String[] args) {

        int num = 9;
        double decimal = (double) num;

        System.out.println(num);
        System.out.println(decimal);
    }
}
