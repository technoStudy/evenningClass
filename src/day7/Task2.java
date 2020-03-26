package day7;

public class Task2 {
    // print your name in "UPPERCASE" and surname in "lowercase"
    //    name = "Michael";
    //    surname = "Jackson";
    //
    //    MICHAEL jackson

    public static void main(String[] args) {

        String name = "Michael";
        String surname = "Jackson";

        name = name.toUpperCase();
        surname = surname.toLowerCase();
        System.out.println( name + " " + surname );
        System.out.println( name.concat( " " ).concat( surname ) );
    }

}
