package day32.nonAccessModifier.staticModifier;

public class Person {
    private static String planetName = "Earth";

    private String fullName;

    private void print() {
        System.out.println("Planet: " + planetName);
        System.out.println("Full name: " + fullName);
        System.out.println();
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "John Alister";
        person1.print();

        Person person2 = new Person();
        person2.fullName = "Max Brown";
        person2.planetName = "Mars";
        person2.print();

        System.out.println("After expedition");
        person1.print();
        person2.print();
    }

}
