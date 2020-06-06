package day50.tasks.task2;

import day50.tasks.task2.food.AdanaKebab;
import day50.tasks.task2.food.Food;

public class Kitchen {

    public void cook(Food food) {
        System.out.println("starting");

        if(food instanceof AdanaKebab) {
            AdanaKebab kebab = (AdanaKebab) food;
            System.out.println(kebab.marinade());
            System.out.println(kebab.grill());
        }


        System.out.println("finished");
    }
}
