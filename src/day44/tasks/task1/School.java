package day44.tasks.task1;

import java.util.List;

public class School {
    private String name;
    private int maxStudents;
    private List<Student> students;
    private List<Employee> employees;

    public List<Student> registerStudent(Student student){
        students.add(student);

        return students;
    }

    public List<Employee> registerEmployee(Employee employee){
        employees.add(employee);

        return employees;
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
