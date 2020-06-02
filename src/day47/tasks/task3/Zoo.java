package day47.tasks.task3;

import day47.tasks.task3.bird.Swallow;
import day47.tasks.task3.cat.BritishShorthair;
import day47.tasks.task3.cat.Lion;
import day47.tasks.task3.cat.Tiger;
import day47.tasks.task3.fish.Salmon;

public class Zoo {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.setName("Shere Khan");
        System.out.println(tiger);

        Lion lion = new Lion();
        lion.setName("Simba");
        System.out.println(lion);

        Salmon salmon = new Salmon();
        salmon.setName("Nemo");
        System.out.println(salmon);

        Swallow swallow = new Swallow();
        swallow.setName("Pidgeot");
        System.out.println(swallow);


        Animal animal = new BritishShorthair();
    }
}
