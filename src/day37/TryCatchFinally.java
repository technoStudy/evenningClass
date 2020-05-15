package day37;

public class TryCatchFinally {

    public static void main(String[] args) {

        //try can be without catch, if there is finally, but it(try) cant be alone
        try {
            System.out.println("Try block");
        } catch(Exception ex) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }


    }
}
