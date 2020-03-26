package day5;

import java.util.Scanner;

public class JavaScanner {

//    String  -> texts
//    byte    -> whole numbers
//    short   -> whole numbers
//    int     -> whole numbers
//    long    -> whole number;
//    boolean -> true false
//    double  -> decimal numbers
//    float   -> decimal numbers
//    char    -> character

/*
    Scanner:
        Scanner is a class for getting the input of the primitive types like int , boolean
            and also String..   It is the easiest way to read input in the java programing.
 */


    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // system in is an InputStream which is typically connected to keyboard input of console programs.

        String username = scanner.nextLine();
        System.out.println("Your first name is " + username);

        String lastName = scanner.nextLine();
        System.out.println("Your last name is " + lastName);

    }

}
