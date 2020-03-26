package day7;

public class StringReplaceAll {
    /*
    replaceAll()

    Replaces each substring of this string that matches
    the given regular expression with the given replacement

    String
     */

    public static void main(String[] args) {
        String text = "Edit the Expression & Text To See Matches";

        System.out.println( "original: " + text );
        System.out.println( "after replaceAll: " + text.replaceAll( "[A-Z]", "%" ) ); // will change every big letter
        System.out.println( "after replace: " + text.replace( "E", "%" ).replace( "T", "%" ) ); // will change only E and T, not everything

    }

}
