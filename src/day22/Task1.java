package day22;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

    // create a method that will generate arrayList of double with random double values
    public static ArrayList<Double> generateList() {
        //step 1: create arrayList
        ArrayList<Double> list = new ArrayList<>();

        //step 2: fill array list with random double numbers
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            //1. way random
//            list.add(Math.random()*100);
            //2 way
            list.add(random.nextDouble()*100);
        }

        //step 3: return array list;
        return list;
    }

    // create a method to retrieve an element at specified index from given arrayList
    public static double retrieve(ArrayList<Double> list, int index){
        return list.get(index);
    }

    // create a method to update element in specified position
    public static void update(ArrayList<Double> list, int index, double newValue){
        list.set(index, newValue);
    }

    // create a method to remove the third element from a arrayList
    public static void deleteThird(ArrayList<Double> list){
        list.remove(2);
    }

    public static void main(String[] args) {
//        ArrayList<Double> decimals =

        generateList();


        ArrayList<Double> list = new ArrayList<>();
        double secondElement = retrieve(list, 1);

//        update(decimals, 0, 555);

//        System.out.println(decimals);

//        deleteThird(decimals);
    }
}
