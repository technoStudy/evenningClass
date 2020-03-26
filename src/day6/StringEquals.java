package day6;

public class StringEquals {

    /*
    equals()

    Compares two strings.
    Returns true if the strings are equal,
    and false if not

    boolean
     */


    public static void main(String[] args) {
        String s1 = "Hello";

        boolean checkingEquals = s1.equals( "Hello" );
        System.out.println( "is Hello same as Hello: " + checkingEquals );
        System.out.println( "is Hello same as hello: " + s1.equals( "hello" ) );


    }
}
