package day32.nonAccessModifier.finalModifier;


class Person {
    public String name;
    public final String dob;//date of birth
    public final String eyeColor;

    public Person(String name, String dob, String color) {
        this.name = name;
        this.dob = dob;
        this.eyeColor = color;
    }
}

public class Ex1 {

    public static void main(String[] args) {
        Person person1 = new Person("Halit", "04/07/95", "blue");

        person1.name = "Serdar";

        //person1.dob = "05/09/99";


    }
}
