package day14;

import java.util.Scanner;

public class Task4 {
    // Determine and print the number of times
    // the character ‘a’ appears in the input entered by the user.

    // input: Test output
    //        a: 0

    // input: Ola amigo
    //        a:2

    //hint: .charAt(), .length(), for, index, counter, if statement

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println( "Provide a text:" );
        String text = input.nextLine();


        int result = 0;
        for(int index = 0; index < text.length(); index++) {
            char letter = text.charAt( index );

            if(letter == 'a') {
                System.out.println( "I have my letter: " + letter );
                result++; //result +=1; ++result; result = result + 1;

            }

        }

        System.out.println( "Result is : " + result );

    }
}
