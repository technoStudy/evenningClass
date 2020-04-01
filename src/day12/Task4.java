package day12;

import java.util.Random;

public class Task4 {
    // write a program that prints word representation of your number
    //      and number is between 0 and 5
    // ex: 0 => zero
    // ex: 3 => three

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt( 10 );// 0 - 5
        System.out.println( "Number: " + number );

        switch(number) {
            case 0:
                System.out.println( "it is zero" );
                break;
            case 1:
                System.out.println( "it is one" );
                break;
            case 2:
                System.out.println( "it is two" );
                break;
            case 3:
                System.out.println( "it is three" );
                break;
            case 4:
                System.out.println( "it is four" );
                break;
            case 5:
                System.out.println( "it is five" );
                break;
            default:
                System.out.println( "input was not good" );
                break;
        }

    }
}
