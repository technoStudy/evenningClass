package day26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Task2 {
    // create method that returns ArrayList<Integer> with random numbers
    // constraints: random bound = 3
    //              list size >= 10
    public static ArrayList<Integer> getRandomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(3));
        }

        return numbers;
    }

    // create method that counts frequency of numbers in list
    // Hint: map, .containsKey(), .get(), .put(), if
    // 0 : 3
    // 1 : 4
    // 2 : 3

    // create method that returns HashMap
    // put numbers from ArrayList as key and values must be 1
    public static HashMap<Integer, Integer> getFrequency(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer key : list) {
            // check if you already have "key" in your map
            // if you have, print ("I have already " + key)
            // else, put key in map
            if (map.containsKey(key)) {
                System.out.println("I have already " + key);

                //get frequency of current key,
                // increment by one and print it
                Integer value = map.get(key);
                value++;
                System.out.println("Value " + value);

                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }

        return map;
    }


    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = getRandomNumbers();

        HashMap<Integer, Integer> frequencyMap = getFrequency(randomNumbers);

    }
}
