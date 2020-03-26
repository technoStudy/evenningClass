package day7;

public class Task1 {
    // write a java program that will check if text is
    // starts with "Hello"
    // ex: Hello World!!! -> true
    // ex: Hi everyone -> false

    // part 2
    // check if it's starts with "Hello" ends with "!!!"

    public static void main(String[] args) {

        String text = "Hello World!!!";
        System.out.println( "is text starts with Hello: " + text.startsWith( "Hello" ) );
        System.out.println( "is text end with Hello: " + text.endsWith( "!!!" ) );


    }

}
