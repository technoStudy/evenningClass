package day8;

public class JavaArithmeticOperators1 {
        /*
    + : plus, addition
    x + y
    Adds x and y
    float num = 23.4 + 1.6; // num=25

    - : minus
    x - y
    Subtracts y from x
    long n = 12.456 – 2.456; //n=10

    -x :
    Arithmetically negates x
    int i = 10; -i; // i = -10

     */

    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        // +
        System.out.println( "plus, addition" );
        System.out.println( "a+b=" + (a + b) );
        System.out.println( "5+2=" + (5 + 2) );

        // -
        System.out.println( "\nminus, subtract" );
        System.out.println( "a-b=" + (a - b) );
        System.out.println( "5-2=" + (5 - 2) );

        // - negation
        System.out.println( "b after negation: " + (-b) );
        a = -a; // reassign with negate variable
        System.out.println( "a after negation: " + a );

    }

}
