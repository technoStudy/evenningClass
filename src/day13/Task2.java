package day13;

import java.util.Scanner;

public class Task2 {
    // write a java program which read text from user
    // and prints it 5 times

    public static void main(String[] args) {
        Scanner read = new Scanner( System.in );

        System.out.println( "Enter text: " );
        String text = read.nextLine();

        String result = "";
        int i = 0;
        while(i < 5) {
            ///System.out.print( text );
            result += text;
            System.out.println( i + "." + result );



            i++;
        }

        System.out.println( "Final result: " + result );
    }

}
//8:13
