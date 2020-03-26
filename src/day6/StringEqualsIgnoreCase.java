package day6;

public class StringEqualsIgnoreCase {

    /*
    equalsIgnoreCase()

    Compares two strings, ignoring case considerations

    boolean
     */
    public static void main(String[] args) {
        String s1 = "Hello";

        System.out.println( "is Hello same as Hello: " + s1.equalsIgnoreCase( "Hello" ) );
        System.out.println( "is Hello same as hello: " + s1.equalsIgnoreCase( "hello" ) );


    }
}
