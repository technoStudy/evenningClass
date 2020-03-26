package day5;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        String address = input.nextLine();
        System.out.println("your address is " +address);

//      Create one string and use scanner to type in the console
//         city -> String name

        String city = input.nextLine();
        System.out.println("your current city is " + city);


//       how to store in the int  -> nextInt()

        int zipCode = input.nextInt();
        System.out.println("your zip code is " + zipCode);

//        Please create one age integer
//        enter age
//        Print the age

        int age = input.nextInt();
        System.out.println("Your age is " + age);

//        Please create one String
//        Enter the country
//        Print the country

        input.nextLine();
        String country = input.nextLine();
        System.out.println("your country is " + country);

/*
    We are using nextLine to store in the String
    We are using nextInt to store in the int
 */

    }
}
