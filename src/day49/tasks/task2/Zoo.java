package day49.tasks.task2;

import java.util.Arrays;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        LivingThings cat = new Cat();
        Animal shark = new Shark();
        Animal swallow = new Swallow();
        Animal duck = new Duck();


        List<Animal> animals = Arrays.asList(shark, swallow, duck);

        for(Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ": " +animal.food());
        }

    }
}
