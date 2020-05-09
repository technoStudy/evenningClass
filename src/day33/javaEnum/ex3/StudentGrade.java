package day33.javaEnum.ex3;

import java.util.Arrays;

public enum StudentGrade {
    A("Excellent",1),
    B("Very Good",2),
    C("Progressing",3),
    D("In Danger",4),
    F("Failing",5);

    public String name;

    public int pos;

    private StudentGrade(String name, int position){
        this.name = name;
        this.pos = position;
    }
}

class Ex3{
    public static void main(String[] args) {
        System.out.println(StudentGrade.A);
        System.out.println(StudentGrade.A.name);

        System.out.println(Arrays.toString(StudentGrade.values()));

    }
}
