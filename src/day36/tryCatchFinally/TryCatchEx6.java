package day36.tryCatchFinally;

import java.util.Scanner;

public class TryCatchEx6 {

    public static void main(String[] args) {
        System.out.println("Provide a number please:");
        Scanner scanner = new Scanner(System.in);

        try{
            int num = scanner.nextInt();
//            int num = Integer.parseInt(text);
            System.out.println("power of two is " + (num * num));
        }catch(Exception ex){
            System.out.println("You have some errors in your input");
        }finally {
            System.out.println("Thank you for using our application");
        }
    }

}
