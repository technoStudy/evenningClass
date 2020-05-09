package day33.javaEnum.ex2;

public class Book {
    private String name;
    private BookCategory bookCategory;

    public Book(String name, BookCategory bookCategory) {
        this.name = name;
        this.bookCategory = bookCategory;
    }

    public BookCategory getBookCategory(){
        return this.bookCategory;
    }

    public String toString() {
        return "Book" +
                "\nname: " + name +
                "\nbookCategory: " + bookCategory;
    }
}
