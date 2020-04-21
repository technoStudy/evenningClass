package day23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Task1 {
    // Create method that generates a HashSet of
    // given numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
    public static HashSet<Integer> generateSet() {
        HashSet<Integer> set = new HashSet<>();
        //1. way
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        //2. way
        int[] array = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        for(int number : array) {
            set.add(number);
        }

        return set;
    }

    // create method with varargs to add elements to set
    // hint: varargs...
    // parameters: set, integers...
    public static void addElements(HashSet<Integer> set, Integer... values) {//Integer[] values
        for(int number : values) {
            set.add(number);
        }
    }

    // create method that prints
    // set elements in separate lines
    public static void printElements(HashSet<Integer> set) {
        //1. way
        for(Integer integer : set) {
            System.out.println(integer);
        }

        //2. way
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }

    // create method that converts HashSet to ArrayList
    //Hint: parameter: HashSet,
    // return type: ArrayList
    public static ArrayList<Integer> convertToArrayList(HashSet<Integer> set) {
//        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1. way
//        for(Integer number : set) {
//            arrayList.add(number);
//        }

        // 2. way
        // arrayList.addAll(set);

        // 3.way
        ArrayList<Integer> arrayList = new ArrayList<>(set);

        return arrayList;
    }

    // create method that returns int[] from provided HashSet<Integer>
    // Hint: convert HashSet to array
    public static int[] convertToArray(HashSet<Integer> set) {
        //1. way
        ArrayList<Integer> list = convertToArrayList(set);

        int[] arrayInts = new int[set.size()];

        for(int i = 0; i < list.size(); i++) {
            arrayInts[i] = list.get(i);
        }
        return arrayInts;
    }


    public static void main(String[] args) {
        HashSet<Integer> integers = generateSet();

        addElements(integers, 10, 100, 100);
        addElements(integers, 50);


        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(7);
        int[] ints = convertToArray(set);
    }
}
