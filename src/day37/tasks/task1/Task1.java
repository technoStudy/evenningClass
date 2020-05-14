package day37.tasks.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please provide a number: ");
        String text = scan.nextLine();

        try {
            int number = Integer.parseInt(text);

            System.out.println("Your integer is: " + number);
        } catch(Exception ex) {
            ex.printStackTrace();
//            System.out.println("Invalid input, please provide number in digit format");
        }

        NumberFormatException e;

    }
}
