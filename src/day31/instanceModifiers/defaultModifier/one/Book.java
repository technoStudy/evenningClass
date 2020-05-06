package day31.instanceModifiers.defaultModifier.one;

/*
default(package-private)
The code is only accessible in the same package.
This is used when you don't specify a modifier

 */
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
