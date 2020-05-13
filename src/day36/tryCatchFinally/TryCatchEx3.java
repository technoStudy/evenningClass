package day36.tryCatchFinally;

public class TryCatchEx3 {

    public static void main(String[] args) {
        String str = null;

        try { // try block used to test you statements/code
            char charAt = str.charAt(0);
        }catch(Exception e){// catch block is executed only if you have error/exception
            System.out.println("no index");
        }finally {// finally block is executed no matter what
            System.out.println("no matter what, this will execute");
        }

        System.out.println("end of code");

    }

}
