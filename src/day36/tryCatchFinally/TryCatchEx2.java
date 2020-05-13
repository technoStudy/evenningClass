package day36.tryCatchFinally;

public class TryCatchEx2 {

    public static void main(String[] args) {
        String str = "Hello";

        try {
            str.length();
        } catch(Exception e) {
            System.out.println("Your variable str is null: " + e.getMessage());
        }


        System.out.println("end of code");

    }

}
