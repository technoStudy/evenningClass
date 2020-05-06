package day31.instanceModifiers.protectedModifier.same;

/*
default(package-private)
The code is only accessible in the same package.
This is used when you don't specify a modifier

 */
public class Book {

    //protected access modifier
    protected String name;

    protected Book() {
    }

    protected void print() {
        System.out.println("Name: " + name);
    }

}
