package day45.staticInheritance;

public class A {

    public static void staticMethod() {
        System.out.println("Class A");
    }
}
















class B extends A {

    //static methods are not overridable
    //this is method hiding
    //@Override
    public static void staticMethod() {
        System.out.println("Class B");
    }
}

class App{

    public static void main(String[] args) {
        B.staticMethod();
    }
}



