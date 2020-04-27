package day22;

import java.util.ArrayList;
import java.util.Collections;

public class JavaCol {

    public static void main(String[] args) {

        // Collections.sort(); // to sort collection: arrayList, map, set
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println("not sorted: " + numbers);
//        Collections.sort(numbers);
        System.out.println("after sorted: " + numbers);


        // Collections.max() - to get maximum value in arrayList
        Integer max = Collections.max(numbers);

        // Collections.min() - get minimum value in arrayList
        Integer min = Collections.min(numbers);

        // Collections.reverse(); to reverse arrayList
        Collections.reverse(numbers);

        // Collections.fill(); to fill out you arrayList
//        Collections.fill(numbers, 101);

        // Collections.replaceAll(); to replace some elements with new value
        Collections.replaceAll(numbers, 69, 500);

    }
}
