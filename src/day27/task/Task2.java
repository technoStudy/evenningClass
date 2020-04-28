package day27.task;

// create class Student with fields:
// string name, double examResult

class Student {
    String name;
    double examResult;
}


public class Task2 {
    // create 3 objects of Student class and print them
    // 1. way create three objects in main
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.name = "Armin";
//        student1.examResult = 98.7;
//        System.out.println(student1.name + ": " + student1.examResult);
//
//        Student student2 = new Student();
//        student2.name = "Mikasa";
//        student2.examResult = 85.5;
//        System.out.println(student2.name + ": " + student2.examResult);
//
//        Student student3 = new Student();
//        student3.name = "Jon Snow";
//        student3.examResult = 53.5;
//        System.out.println(student3.name + ": " + student3.examResult);

        Student student1 = createStudent("Armin", 98.8);
        printStudent(student1);

        Student student2 = createStudent("Mikasa", 85.5);
        printStudent(student2);

        Student student3 = createStudent("Jon Snow", 53.5);
        printStudent(student3);

    }

    // 2. way create objects in method
    // 8:30
    public static Student createStudent(String name, double examResult) {
        // your code to create Student object and return it;
        Student student = new Student();
        student.name = name;
        student.examResult = examResult;

        return student;
    }

    public static void printStudent(Student student) {
        //your code to print student
        System.out.println(student.name + " -> " + student.examResult);
    }

    // 3. way store them in ArrayList

}
