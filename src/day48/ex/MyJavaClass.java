package day48.ex;

public class MyJavaClass {

    public String toString() {
        return getClass().getSimpleName();
    }

    public static void main(String[] args) {

        MyJavaClass my = new MyJavaClass();

        System.out.println(my.toString());
    }
}
