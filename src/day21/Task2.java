package day21;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> myList = generateList();

        removeFirst(myList);
        System.out.println(myList);
    }

    // create a method that will generate arrayList of integers with random numbers
    public static ArrayList<Integer> generateList() {
        // step 1: create arrayList
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        // step 2: create Random
        Random random = new Random();

        // step 3: add some random numbers to list (use .add() method of arrayList)
        randomNumbers.add(random.nextInt(5));
        randomNumbers.add(random.nextInt(100));
        randomNumbers.add(random.nextInt(15));

        // step 4: return you list
        return randomNumbers;
    }

    // create a method that removes first element from arrayList
    public static void removeFirst(ArrayList<Integer> list) {
        list.remove(0);
    }

}
