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
        if(password == null){
            throw new NullPointerException("You password is not valid, its null/non existing");
        }

        //* must not be empty
        if(password.isEmpty()){
            throw new IllegalArgumentException("You password is not valid, its empty");
        }

        //* must not contain only spaces
        //* must contain at least 3 digits
        //* must contain at least 3 letters
        //* must have a length of 6
    }



    //ex
    public void signIn(){
        //
        //checkPassword(password);
    }
}
