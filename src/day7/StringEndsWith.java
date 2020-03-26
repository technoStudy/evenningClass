package day7;

public class StringEndsWith {
    /*
    endsWith()
    Checks whether a string ends with specified characters
    boolean
    */
    public static void main(String[] args) {
        String text = "General Chat";

        System.out.println( "is text ends with gener: " + text.endsWith( "gener" ) );
        System.out.println( "is text ends with Gener: " + text.endsWith( "Gener" ) );
        System.out.println( "is text ends with G: " + text.endsWith( "G" ) );
        System.out.println( "is text ends with Chat: " + text.endsWith( "Chat" ) );
        System.out.println( "is text ends with at: " + text.endsWith( "at" ) );

    }

}
