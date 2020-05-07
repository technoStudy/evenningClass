package day32.nonAccessModifier.finalModifier;


class Person {
    public String name;
    public final String dob;//date of birth
    public final String eyeColor;
    public final long fingerprintCode;

    public Person(String name, String dob, String color, long fingerprintCode) {
        this.name = name;
        this.dob = dob;
        this.eyeColor = color;
        this.fingerprintCode = fingerprintCode;
    }
}

public class Ex1 {

    public static void main(String[] args) {
        Person person1 = new Person("Halit", "04/07/95", "blue", 1929394);

        person1.name = "Serdar";

        //person1.dob = "05/09/99";


    }
}
