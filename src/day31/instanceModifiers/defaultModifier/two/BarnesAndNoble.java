package day31.instanceModifiers.defaultModifier.two;

import day31.instanceModifiers.defaultModifier.one.Book;

public class BarnesAndNoble {

    public static void main(String[] args) {
        // default constructor, .name field, .print() method have package-private access modifier
        // Book book1 = new Book();
        // book1.name = "War and Peace";
        // book1.print();

        Book book2 = new Book("Lord Of the Rings");
        System.out.println(book2);

    }

}
