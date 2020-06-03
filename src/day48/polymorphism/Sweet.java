package day48.polymorphism;

public abstract class Sweet extends Food {

    public Sweet(String name) {
        super(name);
    }

    @Override
    String taste() {
        return "sweet";
    }
}
