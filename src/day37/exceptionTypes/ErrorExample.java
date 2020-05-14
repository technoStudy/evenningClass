package day37.exceptionTypes;

public class ErrorExample {

    public static void main(String[] args) {

        // never handle errors/ dont put them in try-catch
        try {
            run();
        } catch(Error e) {

        }

    }

    public static int run() {
        return run();
    }
}
