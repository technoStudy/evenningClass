package day31.tasks.task2;


// create objects of Student class in Task2.java

public class Task2 {

    public static void main(String[] args) {
        Student student1 = new Student("Rachel", 28);
        // cannot access to private instance field
        // student1.name = "Alice";
        student1.updateName("Alice");

        Student student2 = new Student("Max", 29);
    }
}
