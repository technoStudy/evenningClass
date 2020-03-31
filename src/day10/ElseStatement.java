package day10;

import java.util.Scanner;

public class ElseStatement {
        /*
            Else if  -->> When your if statement is false then JAVA will look for the first else if statement
                    when your first else if is also false then JAVA will look next else if statement.

                    When the condition is correct JAVA will not look other else statements

         */
    // NOTE you can have else if statement as much as you want


    // JAVA WILL PRINT ALL THE CONDITIONS BECAUSE OF ALL OF THEM ARE TRUE

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter name");

        String name1 = input.nextLine();

        System.out.println("enter name");

        String name2 = input.nextLine();

        int total = name1.length() +name2.length();


        if (total>15){

            System.out.println("your string is too long");

        }else if(total > 10){

            System.out.println("Your string is okay");

        }else if (total > 5){

            System.out.println("your string is too short");
        }

    }
}
