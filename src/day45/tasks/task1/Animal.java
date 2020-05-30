package day45.tasks.task1;

import day45.tasks.task1.util.Gender;

public class Animal {

    private String name;
    private String skinColor;
    private int age;
    private String location;
    private Gender gender;

    public Animal(String name, String skinColor, int age, String location, Gender gender) {
        this.name = name;
        this.skinColor = skinColor;
        this.age = age;
        this.location = location;
        this.gender = gender;
    }

    public String eat() {
        return "eat medium";
    }

    public String sleep() {
        return "sleeping all day";
    }

    @Override
    public String toString() {
        return "\nname: " + name +
                "\nskinColor: " + skinColor +
                "\nage: " + age +
                "\nlocation: " + location +
                "\ngender: " + gender +
                "\neat: " + eat() +
                "\nsleep: " + sleep();
    }
}
