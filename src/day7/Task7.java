package day7;

public class Task7 {
    // part 1
    // using text "software DEV inc"
    // fix it to "SOFTWARE DEV inc"
    // hint: use substring

    //part 2
    // use indexOf method instead of using index number

    // part 3
    // using text "software DEVELOPER in test"
    // fix it to "SOFTWARE DEVELOPER in TEST"

    public static void main(String[] args) {
//        String text = "software DEVELOPER inc";
//        // 1. step: separate string in to two parts:
//        // a. "software"  b. " DEVELOPER inc"
//        String part1 = text.substring( 0, 8 ); // can use text.indexOf( " " ) to get correct index
//        System.out.println( "part1: " + part1 );
//
//        String part2 = text.substring( 8 );
//        System.out.println( "part2: " + part2 );
//
//        // 2 step: uppercase part1, and reassign to part1 variable
//        part1 = part1.toUpperCase();
//
//        // 3 step: print them together
//        System.out.println( part1 + part2 );

        String text = "software DEVELOPER inc";

        int beginningIndex = text.indexOf( 's' );
        int endingIndex = text.indexOf( ' ' );

        String part1 = text.substring( beginningIndex, endingIndex );
        System.out.println( "part1: " + part1 );

        beginningIndex = text.indexOf( " DEVELOPER" );
        String part2 = text.substring( beginningIndex );
        System.out.println( "part2: " + part2 );


        part1 = part1.toUpperCase();

        System.out.println(part1+part2);

    }

}
