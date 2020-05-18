package day39.questions;

public class Q17 {

    //throws checked exception, we have to handle it
    public static void method1() throws Exception {
        throw new Exception("Checked Exception");
    }


    //using throws
    public void way1() throws Exception {
        method1();
    }

    //try-catch
    public void way2() {
        try {
            method1();
        } catch(Exception e){

        } finally {

        }
    }
}
