package day44.tasks.task1;

import java.util.List;

public class School {
    private String name;
    private int maxStudents;
    private List<Student> students;
    private List<Employee> employees;

    public List<Student> registerStudent(Student student){
        return null;
    }

    public List<Employee> registerEmployee(Employee employee){
        return null;
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
