package day33.javaEnum.ex2;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {
        Store antStore = new Store();
        antStore.printFantasyBooks();
    }

    //Part1
    //given arrayList of books, print only books with FANTASY category
    //12:05
    public void printFantasyBooks() {
        ArrayList<Book> books = getBooks();

        for(Book book : books) {
//            if(book.getBookCategory() == BookCategory.FANTASY) {
//                System.out.println(book);
//            }
            switch(book.getBookCategory()) {
                case FANTASY:
                    System.out.println("My Fantasy Books");
                    System.out.println(book);
                    break;
                case SCIENCE_FICTION:
                    System.out.println("My Fantasy Science Fiction");
                    System.out.println(book);
                    break;

            }
        }
    }

    public ArrayList<Book> getBooks() {
        ArrayList<Book> list = new ArrayList<>();
        Book book1 = new Book("To Kill Mockinbird", BookCategory.NOVEL);
        Book book2 = new Book("Investing 101", BookCategory.ECONOMY);
        Book book3 = new Book("Neuromancer", BookCategory.FICTION);
        Book book4 = new Book("Leila Mecnun", BookCategory.CLASSIC);
        Book book5 = new Book("The Witcher", BookCategory.FANTASY);

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        return list;
    }

}
