package day11;

public class JavaMath {

    public static void main(String[] args) {
        //Math.abs
        System.out.println( "abs of -5: " + Math.abs( -5 ) );

        //Math.max
        System.out.println( "\nmax of (2,8): " + Math.max( 2, 8 ) );
        //Math.min
        System.out.println( "min of (4,9): " + Math.max( 4, 9 ) );

        //Math.sqrt
        System.out.println( "\nsqrt of 16: " + Math.sqrt( 16 ) );

        //Math.pow
        System.out.println( "\npow of (2,3): " + Math.pow( 2, 3 ) );

        //Math.round
        System.out.println( "\nround of 3.1: " + Math.round( 3.1 ) ); //3
        System.out.println( "round of 3.5: " + Math.round( 3.5 ) ); //4

        //Math.ceil
        System.out.println( "\nceil of 3.1: " + Math.ceil( 3.1 ) );
        System.out.println( "ceil of 3.5: " + Math.ceil( 3.5 ) );

        //Math.floor
        System.out.println( "\nfloor of 3.1: " + Math.floor( 3.1 ) );
        System.out.println( "floor of 3.5: " + Math.floor( 3.5 ) );

        // Math.random(); gives random number between 0.0 and 1.0
        System.out.println( "\nrandom: " + Math.random() );

    }

}
