package day36.tryCatchFinally;

public class TryCatchEx1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        int result = 0;
        try {
            result = a / b;
        } catch(Exception ex) {
            System.out.println("maybe variable b is zero, check it please");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println("my result: " + result);

    }
}
