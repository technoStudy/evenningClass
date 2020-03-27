package day8;

public class JavaArithmeticOperators2 {
/*

    *
    x * y
    Multiplies x by y
    int m = 10*2; // m=20

    /
    x / y
    Divides x by y
    float div = 20/100 ; // div = 0.2

    %
    x % y
    Computes the remainder of dividing x by y
    int rm = 20/3; // rm = 2

*/

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // *
        System.out.println( "multiplication" );
        System.out.println( "a*b=" + (a * b) );

        // /
        System.out.println( "\ndivision" );
        System.out.println( "a/b=" + (a / b) );

        // %
        System.out.println( "\nremainder, mod, modulo" );
        System.out.println( "a%b=" + (a % b) );
        System.out.println( "9%5=" + (9 % 5) );

    }

}
