package day9;

import java.util.Scanner;

public class Task3 {
    // Write a Java program to get a text from the user
    // and print whether it has 't' letter in it

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.println( "Provide a text please: " );
        String text = s.nextLine();

        boolean text_has_t_letter = text.contains( "t" );

        if(text_has_t_letter) {
            System.out.println( " You've got t congrats :D" );
        }

    }

}
