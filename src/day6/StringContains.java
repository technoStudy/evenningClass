package day6;

public class StringContains {

    /*
     contains()

    Checks whether a string contains a sequence of characters

    boolean
     */


    public static void main(String[] args) {
        String s1 = "Hello";

        System.out.println( "Does Hello contains llo: " + s1.contains( "llo" ) );
        System.out.println( "Does Hello contains eo: " + s1.contains( "eo" ) );

    }
}
