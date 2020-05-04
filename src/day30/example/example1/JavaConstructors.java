package day30.example.example1;

class Student {
    String name;
    String surname;

    //constructor - special method that returns instance
    //default constructor, without any parameters
    public Student() {
        System.out.println("Default Constructor");
    }

    //overloaded constructor
    public Student(String n, String s) {
        name = n;
        surname = s;
    }

}

public class JavaConstructors {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.surname = "Wick";

        Student student2 = new Student("Aria", "Stark");

    }

}
