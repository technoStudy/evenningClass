package day33.javaEnum.ex2;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        // print books where BookCategory == DRAMA

        //Hint: change/add something in Book.java, if, loop


        Store amazonStore = new Store();
        ArrayList<Book> allBooks = amazonStore.getAllBooks();

        for (Book book : allBooks) {
            if (book.getBookCategory() == BookCategory.COMICS) {
                System.out.println(book);
            }
        }

    }


    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> list = new ArrayList<>();
        Book book1 = new Book("Spider-man", BookCategory.COMICS);
        Book book2 = new Book("Nomads", BookCategory.HISTORY);
        Book book3 = new Book("Java in 3 month", BookCategory.HORROR);
        Book book4 = new Book("Superman", BookCategory.COMICS);
        Book book5 = new Book("Kite Runner", BookCategory.DRAMA);

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        return list;
    }
}
