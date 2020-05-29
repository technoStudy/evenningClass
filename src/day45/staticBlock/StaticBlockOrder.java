package day45.staticBlock;

public class StaticBlockOrder {

    static {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }

    public StaticBlockOrder(){
        System.out.println("Constructor");

    }

    static {
        System.out.println("C");
    }

    public static void main(String[] args) {

    }

    static {
        System.out.println("D");
    }
}
