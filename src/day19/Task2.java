package day19;

public class Task2 {
    public static void main(String[] args) {
        String firstName = "Eren";
        String lastName = "Yeager";
        //part 1
        char nameFirstLetter = firstLetter(firstName);

        //part 2
        System.out.println(initial(firstName) + initial(lastName));




        System.out.println(initial("Ali") + initial("Coskun"));
        System.out.println(initial("John") + initial("Wick"));
    }

    // create a method that returns first letter of your text
    public static char firstLetter(String text) {
        return text.charAt(0);
    }

    // create a method that prints initials
    // Michael Jackson
    // initials: M.J.
    public static String initial(String name) {
        return firstLetter(name) + ".";
    }

}
