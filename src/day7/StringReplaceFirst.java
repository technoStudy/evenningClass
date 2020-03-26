package day7;

public class StringReplaceFirst {
    /*
    replaceFirst()

    Replaces the first occurrence of a substring that matches
    the given regular expression with the given replacement

    String
     */

    public static void main(String[] args) {
        String text = "Edit the Expression & Text to see matches";

        System.out.println( text );
        System.out.println( text.replaceFirst( "[A-Z]", "THE " ) );

    }

}
