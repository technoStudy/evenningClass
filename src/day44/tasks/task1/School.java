package day44.tasks.task1;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private int maxStudents;
    private List<Student> students = new ArrayList<>();
    private List<Employee> employees;

    public School(String name, int maxStudents) {
        this.name = name;
        this.maxStudents = maxStudents;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> registerStudent(Student student) {
        student.setSchool(this);

        students.add(student);

        return students;
    }

    public List<Employee> registerEmployee(Employee employee) {
        employees.add(employee);

        List<Employee> copy = new ArrayList<>(employees);
        //copy.addAll(employees);
        return copy;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", maxStudents=" + maxStudents +
                ", students=" + students +
                ", employees=" + employees +
                '}';
    }
}
