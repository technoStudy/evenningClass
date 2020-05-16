package day38.tasks.task1;

import java.util.Scanner;

/*
Create class Registration,
a. Create method signUp, where user will provide a password(Scanner)
b. Create method checkPassword, where we will check password for validity

Password rules:
* must not be null
* must not be empty
* must not contain only spaces
* must contain at least 3 digits
* must contain at least 3 letters
* must have a length of 6

ps: try to throw different exceptions
(NullPointerException, IllegalArgumentException, RuntimeException)

 */
public class Registration {

    //a. Create method signUp, where user will provide a password(Scanner)
    public void signUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a password");
        String password = scanner.nextLine();
        checkPassword(password);

        System.out.println("You successfully registered");
    }

    //b. Create method checkPassword, where we will check password for validity
    private void checkPassword(String password) {
        //* must not be null
        if(password == null) {
            throw new NullPointerException("You password is not valid, its null/non existing");
        }
        //* must not be empty
        if(password.isEmpty()) {
            throw new IllegalArgumentException("You password is not valid, its empty");
        }
        //* must not contain only spaces
        if(password.trim().isEmpty()) {
            throw new IllegalArgumentException("You password is not valid, it contains only spaces");
        }
        //* must contain at least 3 digits
        if(countDigits(password) < 3) {
            throw new IllegalArgumentException("You password is not valid, it must contain at least 3 digits");
        }
        //* must contain at least 3 letters
        if(countLetters(password) < 3) {
            throw new IllegalArgumentException("You password is not valid, it must contain at least 3 letters");
        }
        //* must have a length of 6
        if(password.length() < 6) {
            throw new RuntimeException("You password is not valid, it must have a length of 6");
        }
    }


    // create a method which checks if character is letter
    public static boolean isLetter(char character) {
        character = Character.toLowerCase(character);
        return character >= 'a' && character <= 'z';
    }

    // create a method which counts letters in given string
    public static int countLetters(String text) {
        char[] chars = text.toCharArray();
        int counter = 0;
        for(char aChar : chars) {
            if(isLetter(aChar)) {
                counter++;
            }
        }

        return counter;
    }

    // create a method which checks if character is digit
    public static boolean isDigit(char character) {
        return character >= '0' && character <= '9';
    }

    // create a method which counts digits in given string
    public static int countDigits(String text) {
        char[] chars = text.toCharArray();
        int counter = 0;
        for(char aChar : chars) {
            if(isDigit(aChar)) {
                counter++;
            }
        }

        return counter;
    }


}
