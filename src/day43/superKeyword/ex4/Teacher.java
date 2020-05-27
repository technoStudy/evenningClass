package day43.superKeyword.ex4;

public class Teacher extends Person {
    public String name;

    public Teacher(){
        this.name = "Teacher"; //assign to current instance variable
        super.name = "Person"; //assign to superclass instance variable
    }

    @Override
    public String toString() {
        return "Teacher "+ super.toString();
    }
}
