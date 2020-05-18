package day39.questions;

public class Q8 {

    public int b;

    public Q8() {
        System.out.println("Default constructor");
    }

    public Q8(int a) {
        this();

        //this.b;
        System.out.println("Constructor with int param");
    }


    public static void main(String[] args) {
        Q8 q8 = new Q8(4);
    }
}
