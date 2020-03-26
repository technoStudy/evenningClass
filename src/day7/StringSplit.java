package day7;

import java.util.Arrays;

public class StringSplit {

    /*
     split()

    Splits a string into an array of substrings

    String[]
     */

    public static void main(String[] args) {

        String text = "Good evening everybody";
        System.out.println( "original: " + text );
        System.out.println( "after split with ' ':" + Arrays.toString( text.split( " " ) ) );


        text = "Good @ evening @ everybody";
        System.out.println( "original: " + text );
        System.out.println( "after split with ' ':" + Arrays.toString( text.split( "@" ) ) );

    }
}
