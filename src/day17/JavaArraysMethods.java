package day17;

import java.util.Arrays;

public class JavaArraysMethods {
    public static void main(String[] args) {
//            Arrays.toString(array) - get String representation of array in one line
        String[] names = {"Bob", "Eren", "Armin"};
        System.out.println( ".toString: " + Arrays.toString( names ) );

//            Arrays.sort(array);  - to sort array in natural order
        Arrays.sort( names );
        System.out.println( "\n.sort: " + Arrays.toString( names ) );

//            Arrays.equals(array1, array2) - check if both of arrays have same order of values
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 1, 3};
        System.out.println( "\na == b: " + Arrays.equals( a, b ) );
        System.out.println( "a == c: " + Arrays.equals( a, c ) );


//            Arrays.fill(array, value  ); - fill the array with provided value
        int[] numbers = new int[5];
        System.out.println( "\nbefore .fill: " + Arrays.toString( numbers ) );
        Arrays.fill( numbers, 24 );
        System.out.println( "after .fill: " + Arrays.toString( numbers ) );

        // Arrays.binarySearch(array, value); -
        // return index of given value in SORTED array, otherwise returns -1
        int[] evenNumbers = {2, 4, 6, 8, 10, 12};
        System.out.println( "Index of 6 is: " + Arrays.binarySearch( evenNumbers, 6 ) );
        System.out.println( "Index of 14 is: " + Arrays.binarySearch( evenNumbers, 14 ) );

    }

}
