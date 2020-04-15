package day20;

public class Task3 {
    // create a method that will print names in separate line
    public static void printNames(String... names) {
        for(String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        printNames("Dos", "Halit", "Marina", "Fatih");
        printNames("Dos");
    }
}
