package day45.tasks.task1;

import day45.tasks.task1.cat.Lion;
import day45.tasks.task1.util.Gender;

public class Zoo {

    public static void main(String[] args) {
        //Tiger
        //Lion
        Lion lion = new Lion(
                "Aslan",
                "gold",
                5000,
                "Narnia",
                Gender.MALE,
                false
        );

        System.out.println(lion);
    }

}
