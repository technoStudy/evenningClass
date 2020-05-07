package day32.nonAccessModifier.finalModifier;

import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {
        final int i = 10;
        //i = 20;


        final ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(3);

        // cannot reassign because numbers is final variable
        // numbers = new ArrayList<>();
        numbers.clear();

    }
}
