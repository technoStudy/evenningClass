package day50.tasks.task2;

import day50.tasks.task2.food.AdanaKebab;
import day50.tasks.task2.food.Food;
import day50.tasks.task2.food.Lahmacun;

import java.util.ArrayList;
import java.util.List;

public class TechnoCafe {

    public static void main(String[] args) {
        List<Food> mondayMenu = new ArrayList<>();
        mondayMenu.add(new AdanaKebab());
        mondayMenu.add(new Lahmacun());

        Kitchen yusufKitchen = new Kitchen();

        for(Food food : mondayMenu) {
            yusufKitchen.cook(food);
        }

    }
}
