package day28.example.example1;

class Person {

    /*
    A variable which is created inside the class but outside the method is known as an instance variable.
    Instance variable doesn't get memory at compile time.
    It gets memory at runtime when an object or instance is created.
    That is why it is known as an instance variable.
     */
    String name;
    String surname;
    int age;

    // when you have methods that are not static
    // they are instance methods
    int getBirthYear() {
        return 2020 - age;
    }

    String getInitials() {
        return name.charAt(0) + "." + surname.charAt(0) + ".";
    }

    void print() {
        System.out.println("\n-----------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Birth Year: " + getBirthYear());
        System.out.println("Initials: " + getInitials());
        System.out.println("-----------------------------------");
    }
}

public class Ex1 {
    // create a program that calculates
    // birth year of given person

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Mark";
        person1.surname = "Zuckerberg";
        person1.age = 25;
        int person1BirthYear = person1.getBirthYear();
        String person1Initials = person1.getInitials();
        person1.print();

        Person person2 = new Person();
        person2.name = "Tony";
        person2.surname = "Stark";
        person2.age = 31;
        int person2BirthYear = person2.getBirthYear();
        String person2Initials = person2.getInitials();
        person2.print();

    }

}
