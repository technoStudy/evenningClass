package day48.tasks.task3.cat;

import day48.tasks.task3.AbstractAnimal;

public class Cat extends AbstractAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "meow";
    }

}
