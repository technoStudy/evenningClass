package day37.exceptionTypes;

import java.util.Scanner;

public class RuntimeExceptionExample {


    //unpredictable/unexpected exception are runtime/unchecked exceptions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first number: ");
        int a = scanner.nextInt();

        System.out.println("Provide second number: ");
        int b = scanner.nextInt();

        System.out.println("a / b  = " + a / b);

    }
}
