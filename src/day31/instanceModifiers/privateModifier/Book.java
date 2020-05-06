package day31.instanceModifiers.privateModifier;

public class Book {
    private String author;
    private boolean isDigital;

    private Book(String author) {
        this.author = author;
        this.isDigital = true;
    }

    public Book(String author, boolean isDigital) {
        this.author = author;
        this.isDigital = isDigital;
    }

    private void print() {
        System.out.println("Book Author: " + this.author);
        System.out.println("Is Digital: " + this.isDigital);
    }

    public static Book createDigitalBook(String author) {
        return new Book(author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Tolkin");
        book1.print();
        book1.author = "Gete";
        book1.print();
    }

}
