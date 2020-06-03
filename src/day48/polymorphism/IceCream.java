package day48.polymorphism;

public class IceCream extends Sweet {


    public IceCream(String name) {
        super(name);
    }

    @Override
    String taste() {
        return "cold, fresh, sweet";
    }
}
