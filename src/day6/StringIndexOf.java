package day6;

public class StringIndexOf {
    /*
     indexOf()

     Returns the position of the first found occurrence
     of specified characters
     in a string

     int
     */

    public static void main(String[] args) {

        String text = "Good";

        System.out.println("index of G: " + text.indexOf( 'G' ));

        text = "Good morning";
        System.out.println("index of mor: " + text.indexOf( "mor" ));

        System.out.println("index of evening: " + text.indexOf( "evening" ));

    }

}
