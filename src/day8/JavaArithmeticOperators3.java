package day8;

public class JavaArithmeticOperators3 {
    /*
     ++: increment

     --: decrement
     */

    public static void main(String[] args) {
        int x;
        int y;

        // Increment operators
        // Pre-increment - x is incremented by 1, then y is assigned the value of x
        x = 1;
        y = ++x;    // x is now 2, y is also 2
        System.out.println( "\nPre-increment: x=" + x + " y=" + y );

        // Post-increment - y is assigned the value of x, then x is incremented by 1
        x = 1;
        y = x++;    // x is now 2, y is 1
        System.out.println( "\nPost-increment: x=" + x + " y=" + y );


        //-------------------------------------------------------------------------
        // Decrement operators
        // Pre-decrement - x is decremented by 1, then y is assigned the value of x
        x = 1;
        y = --x;    // x is now 0, y is also 0
        System.out.println( "\n\nPre-decrement: x=" + x + " y=" + y );


        // Post-decrement - y is assigned the value of x, then x is decremented by 1
        x = 1;
        y = x--;    // x is now 0, y is 1
        System.out.println( "\nPost-decrement: x=" + x + " y=" + y );


        int a = 10;
        int result = a + ++a + a++ + --a - a--;
        /////////// 10 + 11 + 11 + 11 - 11
        /////////// 32
        // + --a => +  --(12) => + 11
        System.out.println( "result: " + result );

        int i = 5; // i = 5;
        i--; // i = 5;
        i--; // i = 4
        i--; // i = 3
        i--; // i = 2
        System.out.println(i); // i = 1


    }

}
