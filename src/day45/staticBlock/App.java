package day45.staticBlock;

public class App {
    public static String name;

    static {
        name = "Techno Study";
        int age = 10;//just local variable

        System.out.println("Static block");
    }

    public App(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        //System.out.println();

        App myApp = new App();
    }

}

