package day45.initializerBlock;

public class Computer {

    //this is called initializer block
    {
        System.out.println("initializer block");
    }

    public Computer(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Computer();
    }


}
