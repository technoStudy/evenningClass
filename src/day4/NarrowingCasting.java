package day4;
/*
Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
 */
public class NarrowingCasting {

    public static void main(String[] args) {

        double tax = 6.256;
        int roundedTax = (int) tax;

        System.out.println(tax);
        System.out.println(roundedTax);

    }
}
