package day42.tasks.task2;

import java.util.List;

public class School {
    private String name;
    private String email;
    private String phoneNumber;
    private String principal;
    private String address;
    private int schoolSize;
    private List<Student> students;

    public School(String name, String email, String phoneNumber, String principal, String address, List<Student> students) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.principal = principal;
        this.address = address;
        this.students = students;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public void registerStudent(Student student) {
        if(students.size() >= schoolSize) {
            throw new RuntimeException("Student limit exceeded, cannot register more students");
        }
        students.add(student);
    }


    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", principal='" + principal + '\'' +
                ", address='" + address + '\'' +
                ", students=" + students +
                '}';
    }
}
