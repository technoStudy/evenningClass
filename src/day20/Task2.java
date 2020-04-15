package day20;

public class Task2 {
    // create a method that checks if given two names have same length
    public static boolean isSameLength(String name1, String name2) {
        return name1.length() == name2.length();
    }

    // create a method that checks if given three names have same length
    public static boolean isSameLength(String name1, String name2, String name3) {
        return isSameLength(name1, name2) && isSameLength(name2, name3);
    }

    public static boolean isSameLength(String[] names) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Do Eren and Armin have same length: " + isSameLength("Eren", "Armin"));

        System.out.println("Do Eren and Mark have same length: " + isSameLength("Eren", "Mark"));

        System.out.println("Eren, Mark and Sena have same length: " + isSameLength("Eren", "Mark", "Sena"));


        String[] array = {"Eren", "Mark", "Sena"};
        isSameLength(array);
        isSameLength(new String[]{"Eren", "Mark"});

//        isSameLength("Eren", "Mark", "Sena", "Ali", "Dos");
        formatWithVarArgs("Eren", "Mark", "Dos");

    }

    public static void formatWithVarArgs(String... values) {
        // ...
    }



}
