package day12;

import java.util.Scanner;

public class JavaIfElseIfLadderStatement {

    public static void main(String[] args) {
        //if-else-if ladder statement
        int age = 10;

        if(age == 10) { // N  == 10
            System.out.println( "Age is equal to  10" );
        } else if(age > 15) {  // N > 15
            System.out.println( "Age is greater than 15" );
        } else if(age < 5) {  // N < 5
            System.out.println( "Age is smaller than 5" );
        } else { // 5 <= N && N <= 15 && N != 10
            System.out.println( "it is between 5 and 15" );
        }

    }

}
