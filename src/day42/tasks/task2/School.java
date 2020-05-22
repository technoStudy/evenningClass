package day42.tasks.task2;

import java.util.List;

public class School {
    private String name;
    private String email;
    private String phoneNumber;
    private String principal;
    private String address;

    private List<Student> students;

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
