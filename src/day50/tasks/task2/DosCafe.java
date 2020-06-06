package day50.tasks.task2;

import day50.tasks.task2.food.Food;

public class DosCafe {

    public static void main(String[] args) {

        Food baklava = new Food() {
            @Override
            public String taste() {
                return "sugar, sweet";
            }
        };

        Food salad = new Food() {
            @Override
            public String taste() {
                return "fresh";
            }
        };
    }


    private class Kit{
    }
}
