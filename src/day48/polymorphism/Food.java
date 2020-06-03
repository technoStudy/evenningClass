package day48.polymorphism;

public abstract class Food {


    String name;

    public Food(String name) {
        this.name = name;
    }

    abstract String taste();


    @Override
    public String toString() {
        return "\n" +
                "\nname: " + name +
                "\ntaste: " + taste();
    }
}
