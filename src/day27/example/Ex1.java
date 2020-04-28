package day27.example;

public class Ex1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.examResult = 95;

        //1. way
        student1.courseInfo = new Course();
        student1.courseInfo.name = "Techno Study";
        student1.courseInfo.address = "NJ Getty 600";
        student1.courseInfo.phoneNumber = "+1 998 78 74";

        //2. way
        Course course1 = new Course();
        course1.name = "Udemy";
        course1.address = "internet";
        course1.phoneNumber = "+1 335 45 85";
        student1.courseInfo = course1;
        
    }

}
