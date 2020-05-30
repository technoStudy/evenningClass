package day45.tasks.task1.cat;

import day45.tasks.task1.util.Gender;

public class Lion extends Cat {

    public Lion(String name,
                String skinColor,
                int age,
                String location,
                Gender gender,
                boolean isPet) {
        super(name, skinColor, age, location, gender, isPet);
    }

    @Override
    public String eat() {
        return "eat a lot";
    }

    @Override
    public String toString() {
        return "--- Lion ---" +
                super.toString();
    }
}
