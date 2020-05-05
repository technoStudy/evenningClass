package day31.instanceModifiers.publicModifier.other;

import day31.instanceModifiers.publicModifier.same.Student;

public class DifferentPackage {

    public static void main(String[] args) {
        Student student1 = new Student("John");
        System.out.println(student1);
        student1.name = "Max";
        System.out.println(student1.toString());


    }
}
