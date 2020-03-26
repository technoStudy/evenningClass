package day7;

public class Task3 {
    //  Write a Java program to replace all the 'd' characters with 'f' characters
    //      input: The quick brown fox jumps over the lazy dog.
    //      output: The quick brown fox jumps over the lazy fog.

    // part 2:
    // replace all the 'a','t','e' characters with 'f'

    // part 3:
    // replace all the 'o','q','r' characters with 'L' using regex

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog.";
        System.out.println( "original: " + s );

        //part1
        System.out.println( "part1: " + s.replace( "d", "f" ) );

        //part2
        System.out.println( s.replace( "a", "f" )
                .replace( "t", "f" )
                .replace( "e", "f" )
        );

        //part3
        System.out.println( s.replaceAll( "[oqr]", "L" ) );
    }
}
