package day43.superKeyword.ex3;

public class B extends A {
    public int varB;


    public B() {
        //super(); superclass constructor call is implicitly happened
        System.out.println("Constructor of B");
    }


    @Override
    public void print() {
        System.out.println("my B class print()");
    }
}
