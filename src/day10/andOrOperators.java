package day10;

import java.util.Scanner;

public class andOrOperators {

    public static void main(String[] args) {



        /*
            && -> and operator

            || -> or operator

            TechnoStudy

         /



        /
                in the AND (&&) operator

                both of the conditions should be correct
                otherwise it will not execute the code in the curly braces



         /

        String name = "Study";

        if(name.length()>10 && name.contains("Study")){

            System.out.println("it looks good");

        }

        /
            Two strings

            first String is username
            second string is password

            if username contains password
            and password is less then 5

         */

            Scanner df = new Scanner(System.in);

            System.out.println("enter the username");
            String username = df.nextLine();

            System.out.println("enter the password ");
            String password = df.nextLine();

            if (username.contains(password) && password.length() < 5) {

                System.out.println("your password is not accepted ");

            }


        }
    }
