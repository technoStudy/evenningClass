package day47.abstractKeyword.ex2;

public abstract class A {

    public A() {
        System.out.println("constructor of A");
    }

}

class B extends A {
    //JVM will inject/add default constructor for us
    public B() {
        super();     //JVM will call default constructor of super class
    }
}

class Application {

    public static void main(String[] args) {
        B b = new B();
    }
}
