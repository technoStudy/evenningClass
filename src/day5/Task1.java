package day5;


import java.util.Scanner;

public class Task1 {
    // create java application that asks user
    // for username and password

    public static void main(String[] args) {

        Scanner readFromUser = new Scanner( System.in );

        System.out.println( "Provide username please:" );
        String username = readFromUser.nextLine();

        System.out.println( "Provide password please:" );
        String password = readFromUser.nextLine();

        System.out.println( "Username: " + username );
        System.out.println( "Password: " + password );

    }

}