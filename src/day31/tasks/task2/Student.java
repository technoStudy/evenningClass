package day31.tasks.task2;

/*
***Part 1***
create class Student
with private 2 fields: name, age

also, create private "default constructor"
and public constructor that initialize all attributes
 */
public class Student {
    private String name;
    private int age;

    private Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    ***Part 2***
    make some workarounds, and try to update name of Student
     */
    public void updateName(String myName) {
        if(myName.equalsIgnoreCase("alice")) {
            System.out.println("this person is not allowed here!!!");
        } else {
            this.name = myName;
        }
    }

}
