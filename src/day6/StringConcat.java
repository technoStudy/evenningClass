package day6;

public class StringConcat {
    /*
    concat()

    Appends a string to the end of another string
    String
     */

    public static void main(String[] args) {
        String s = "Hi";

        System.out.println( s + " there!" );
        System.out.println( s.concat( " there!" ) );

        String second = " everybody";

        System.out.println( s.concat( second ) );
        ///                "Hi" + " everybody"
        ///                "Hi everybody"
    }
}
