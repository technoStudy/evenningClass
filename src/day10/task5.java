package day10;

import java.util.Scanner;

public class task5 {

    /*
            Scanner object

            String which is start level in the website

            example "4 star" , "5 star "

            int mile
                how far from the downtown

            remove the nun numeric characters from String
            then change the String to double

             if star is less then 3 and mile is > 5
                print this hotel is too far from city and it is not good

             else if star is more - equal then 3 and mile is less - equal to five
                print this hotel is perfect

         */

    public static void main(String[] args) {

        Scanner pd = new Scanner(System.in);

        System.out.println("enter star level");
        String strStar = pd.nextLine();

        System.out.println("how many miles");
        int mile = pd.nextInt();

        System.out.println(strStar + " before replace all ");

//                                                [A-z]   this will remove all the letters
        strStar = strStar.replaceAll("[^\\d.]", ""); // remove all the letters and special characters from string

        System.out.println(strStar + " after replace all");

        double doubleStar = Double.valueOf(strStar);

        if (doubleStar < 3 && mile > 5) {
            System.out.println("his hotel is too far from city and it is not good");

        } else if (doubleStar >= 3 && mile <= 5) {

            System.out.println(" this hotel is perfect");
        }

    }
}
