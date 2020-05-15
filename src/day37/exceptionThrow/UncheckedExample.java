package day37.exceptionThrow;


//Unchecked/Runtime exception
public class UncheckedExample {

    ///username should have at least 5 characters
    public static void checkUsername(String username) {
        if(username == null) {
            throw new NullPointerException("username doesnt exist, it is null");
        }

        if(username.length() < 5) {
            throw new IllegalArgumentException("username is too short, please provide at least 6 characters");
            //throw new RuntimeException("username is too short, please provide at least 6 characters");
        }
    }

    public static void main(String[] args) {
        String name = "dos";

        checkUsername(name);

        System.out.println("You logged in");
    }


}
