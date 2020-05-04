package day30.tasks.task1;

class Book {
    String name;
    int year;

    public Book() {
        name = "Dummy";
        year = 1970;
    }

    public Book(String n, int y) {
        name = n;
        year = y;
    }

    public String toString() {
        return "\n-----------------" +
                "\nName: " + name +
                "\nYear: " + year +
                "\n-----------------";
    }

}

public class Task1 {
    //create class Book, with 2 attributes
    //create 2 constructors

    //print all fields of book in class Task1
    public static void main(String[] args) {
        Book book1 = new Book("Lord of the Rings", 1969);
        System.out.println(book1);

        Book book2 = new Book();
        System.out.println(book2);

    }
}
