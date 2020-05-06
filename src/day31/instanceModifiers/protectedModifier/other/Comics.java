package day31.instanceModifiers.protectedModifier.other;

import day31.instanceModifiers.protectedModifier.same.Book;

public class Comics extends Book {

    public static void main(String[] args) {
        Comics book1 = new Comics();
        book1.name = "War and Peace";
        book1.print();
    }

}
