package day31.instanceModifiers.defaultModifier.one;

public class Book {

    //default/package-private access modifier
    String name;

    Book() {}

    public Book(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("Name: " + name);
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

}
