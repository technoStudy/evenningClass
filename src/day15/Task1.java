package day15;

public class Task1 {
    // print grid of "#" with 5 rows and 5 columns
    // using nested loop

//            #####
//            #####
//            #####
//            #####
//            #####
    // hint: print, println

    public static void main(String[] args) {

        for(int row = 0; row < 5; row++) { // row

            for(int col = 0; col < 5; col++) { // column
                System.out.print( "#" );
            }

            System.out.println();
        }

    }

}
