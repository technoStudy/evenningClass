package day32.nonAccessModifier.finalModifier;

import java.util.ArrayList;

public class School {

    private final ArrayList<Person> students = new ArrayList<>();

    public static void main(String[] args) {
        School school = new School();
        school.students.add(new Person("Max", "01/01/90","Red"));
        school.students.add(new Person("Aliya", "05/05/89","Gray"));

    }

}
