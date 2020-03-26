package day5;

import java.util.Scanner;

public class ScannerEx6 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner( System.in );

//      byte  ->> nextByte()  -128 -- 127
        System.out.println( "how many tickets you want " );
        byte totalTicketCount = s1.nextByte();

        System.out.println( "answer for the ticket count " + totalTicketCount );

//      short  --> nextShort()
        System.out.println( "Total amount for the tickets" );
        short ticketTotal = s1.nextShort();

        System.out.println( "Total amount of your tickets " + ticketTotal );

//      char  -->  we are not able to use the char
//      float -->  nextFloat()
        System.out.println( "Single ticket price " );
        float singleTicket = s1.nextFloat();

        System.out.println( "Single amount of your ticket " + "$ " + singleTicket );

//        Scanner class
//        We are able to type in the console we can also print it
//        String -- > nextLine()
//        int -- > nextInt()
//        boolean -- > nextBoolean()
//        byte -- > nextByte()
//        short -- > nextShort()
//        float -- > nextFloat()


//  String user name and string last name print it in the one line

        String name = "Michael";
        String lastName = "Jackson";

        System.out.println( name + " " + lastName );
        System.out.print( name + " " + lastName );

    }

}
