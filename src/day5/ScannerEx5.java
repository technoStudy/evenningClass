package day5;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {

//        How to write in string ,int ,double
//        boolean ->true and false

//        create one boolean and do you want an insurance print the boolean

        Scanner s1 = new Scanner( System.in );

        System.out.println( "Do you want an insurance " );
        boolean insurance = s1.nextBoolean();

        System.out.println( "do you want a insurance: " + insurance );

//      create boolean do you want two way ticket
        System.out.println( "Do you want a two way ticket " );
        boolean twoWay = s1.nextBoolean();

        System.out.println( "Answer for the two way question: " + twoWay );

    }

}
