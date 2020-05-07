package day32.nonAccessModifier.finalModifier;

import java.util.ArrayList;

public class School {

    private final ArrayList<Person> students = new ArrayList<>();
    private final int serialNumber = 10;

    public static void main(String[] args) {
        School school = new School();
        school.students.add(new Person("Max", "01/01/90", "Red"));
        school.students.add(new Person("Aliya", "05/05/89", "Gray"));


        ArrayList<Person> newList = new ArrayList<>();
        newList.add(new Person("Dos", "01/01/89", "brown"));
        newList.add(new Person("Serdar", "02/01/89", "brown"));
        newList.add(new Person("Max", "05/09/99", "green"));


        // cannot do this, because school.students is final variable
        // school.students = newList;
        school.students.addAll(newList);
    }

}
