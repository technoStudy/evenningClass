package day42.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagement {

    public static void main(String[] args) {
        School school1 = new School("TechnoStudy",
                "info@techno.study",
                "+1-557-663-45-22",
                "Fetih",
                "Getty 600",
                getStudents());
        school1.setSchoolSize(5);
        school1.registerStudent(new Student("Fetih"));
        school1.registerStudent(new Student("Yusuf"));

        System.out.println(school1);


    }

    public static List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ersin"));
        list.add(new Student("Muhammed"));
        list.add(new Student("Dos"));
        list.add(new Student("Amal"));

        return list;
    }
}
