package day45.questions.q3;

class A {
    static {
        System.out.println("A");
    }
}

class B extends A {
    static {
        System.out.println("B");
    }
}

class C extends B {
    static {
        System.out.println("C");
    }

    public static void main(String[] args) {

    }
}

public class Q3 {
}
