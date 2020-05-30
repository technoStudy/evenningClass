package day45.tasks.task1.cat;

import day45.tasks.task1.Animal;
import day45.tasks.task1.util.Gender;

public class Cat extends Animal {
    //domestic wild
    private boolean pet;

    public Cat(String name, String skinColor, int age, String location, Gender gender, boolean isPet) {
        super(name, skinColor, age, location, gender);
        setPet(isPet);
    }


    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "\npet: " + pet +
                super.toString();
    }
}
