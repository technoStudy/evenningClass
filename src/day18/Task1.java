package day18;

public class Task1 {
    public static void main(String[] args) {
        String[][] array = {
/*          column: 0        1         2    */
                {"apple", "lemon", "peach"}, // ro`w 0
                {"green", "yellow", "red"},   // row 1
        };
        System.out.println( "Row count: " + array.length );
        System.out.println( "Column count at Row[0]: " + array[0].length );
        System.out.println( "Column count at Row[1]: " + array[1].length );

        //part 1. print fruit and color, without loop
        // apple green
        // lemon yellow
        // peach red
        //hardcode
        System.out.println( "\nPart 1. first way --------------------------" );
        System.out.println( array[0][0] + " " + array[1][0] );
        System.out.println( array[0][1] + " " + array[1][1] );
        System.out.println( array[0][2] + " " + array[1][2] );

        System.out.println( "\nPart 1. second way --------------------------" );
        System.out.print( array[0][0] + " " );
        System.out.print( array[1][0] + " " );
        System.out.println();
        System.out.print( array[0][1] + " " );
        System.out.print( array[1][1] + " " );
        System.out.println();
        System.out.print( array[0][2] + " " );
        System.out.print( array[1][2] + " " );
        System.out.println();


        //part 2. print fruit and color, with only one loop
        System.out.println( "\nPart 2 --------------------------" );
        for(int i = 0; i < 3; i++) { // 0 1 2
            System.out.println( array[0][i] + "  " + array[1][i] );
        }

        //part 3. print fruit and color, with two loops
        //column: 0        1         2
        //    {"apple",  "lemon",   "peach"}, // row 0
        //    {"green",  "yellow",  "red"},   // row 1
        System.out.println( "\nPart 3 --------------------------" );
        for(int col = 0; col < 3; col++) { // 0 1 2
            for(int row = 0; row < 2; row++) { // 0 1
                System.out.print( array[row][col] + " " );
            }
            System.out.println();
        }

    }

}
