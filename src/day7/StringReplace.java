package day7;

public class StringReplace {
    /*
    replace()

    Searches a string for a specified value,
    and returns a new string where the specified values are replaced

    String
    */

    public static void main(String[] args) {

        String text = "Hello World!!!";

        System.out.println( "before changing: " + text );
        System.out.println( "changing o with A: " + text.replace( "o", "A" ) );
        System.out.println( "changing Hello with Bonjour: " + text.replace( "Hello", "Bonjour" ) );

        System.out.println( "changing ' ' with ',': " + text.replace( " ", "," ) );


    }

}
