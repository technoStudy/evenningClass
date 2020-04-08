package day16;

public class JavaArrayEx1 {

    public static void main(String[] args) {
        int[] numbers = {99, 88, 55};
        //               0   1   2

        // print from first element to the last
//        System.out.println( "printing in natural order" );
//        for(int i = 0; i < numbers.length; i++) { // 0 1 2 3 4
//            System.out.print( numbers[i] );
//        }
//
//        System.out.println( "printing in reverse order" );
//        // print from last element to the first
        for(int i = numbers.length - 1; i >= 0; i--) { // 4 3 2 1 0
            System.out.print( numbers[i] );
        }


        // hardcode
        //System.out.println( numbers[1] );
//        System.out.println( numbers[1] );
//        System.out.println( numbers[2] );
//        System.out.println( numbers[3] );
    }

}
