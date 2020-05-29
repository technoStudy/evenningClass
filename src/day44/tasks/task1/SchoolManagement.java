package day44.tasks.task1;

import java.util.List;

public class SchoolManagement {

    public static void main(String[] args) {
        School yamanlar = new School("Yamanlar", 1);
        School ps24 = new School("PS 24", 1);

        //better way to assign school
        yamanlar.registerStudent(new Student("Muhammed", "Texas", 1000));
        yamanlar.registerStudent(new Student("Yusuf", "NJ", 1500));


        //not the best way to assign school
        yamanlar.registerEmployee(new Employee("Halit", "NJ", yamanlar, 100_000));
        List<Employee> employees = yamanlar.registerEmployee(new Employee("Tuba", "GE", ps24, 250_000));
        employees.add(new Employee("HACKER","DARK NET", yamanlar, 100000000.0));


        System.out.println(yamanlar);
    }
}
