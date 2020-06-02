package day47.abstractKeyword.ex3;

public abstract class A {
    {
    }

    static {
    }

    public abstract void print();
    public abstract void showName();


}

abstract class B extends A {
//    @Override
//    public void print() {
//        System.out.println("B class");
//    }
}

class C extends B {

    @Override
    public void print() {

    }

    @Override
    public void showName() {

    }
}
