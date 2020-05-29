package day45.initializerBlock;

public class InitializerBlockOrder {

    {
        System.out.println("1");
    }

    public InitializerBlockOrder(){
        System.out.println("Constructor");
    }

    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        InitializerBlockOrder obj = new InitializerBlockOrder();
    }

    {
        System.out.println("3");
    }

    {
        System.out.println("4");
    }
}
