package day28.example.example1;

class Person {
    /*
    A variable which is created inside the class but outside the method is known
    as an instance variable.
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
        return name.charAt(0) + "." + surname + ".";
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + getInitials());
    }
}

public class Ex1 {
    // create a program that calculates
    // birth year of given person

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Mark";
        person1.age = 25;
        int person1BirthYear = person1.getBirthYear();

        Person person2 = new Person();
        person2.name = "Dos";
        person2.age = 31;
        int person2BirthYear = person2.getBirthYear();

//        int birthYear = getBirthYear(person1);

    }

    public static int getBirthYear(Person person) {
        return 2020 - person.age;
    }

}
