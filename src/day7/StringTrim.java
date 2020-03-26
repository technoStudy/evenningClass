package day7;

public class StringTrim {
    /*
    trim()
    Removes whitespace from both ends of a string
    String
    */

    public static void main(String[] args) {

        String text = "        Cut down           ";
        System.out.println( ">" + text + "<" );
        System.out.println( ">" + text.trim() + "<" );
    }

}
