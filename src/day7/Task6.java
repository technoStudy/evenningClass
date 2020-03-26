package day7;

public class Task6 {
    //Given two strings, a and b,
    // output the result of putting them together in the order bbaa,
    //
    // e.g. "Hi" and "Bye" returns "ByeByeHiHi".

    //part 2, use .concat method instead of +

    //part 3, use scanner to provide input strings

    public static void main(String[] args) {

        String a = "Fox";
        String b = "Box";

        System.out.println( b + b + a + a );

        //part 2
        System.out.println( b.concat( b ).concat( a ).concat( a ) );

    }
}
