package day21;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        printColors(colors);

        addToFirstPosition(colors, "Yellow");
        addToFirstPosition(colors, "Pink");
        addToFirstPosition(colors, "Purple");


        printColors(colors);

//        printSeparate(colors);
    }

    // Write a method to create a new array list,
    // add some colors (string) and print out the collection.
    public static void printColors(ArrayList<String> list) {
        System.out.println("My favorite colors: " + list);
    }

    // Write a method to iterate through all elements in arrayList
    // and print in separate lines
    public static void printSeparate(ArrayList<String> list) {
        System.out.println("\nprintSeparate ------------------");
        // 1. way for-each
        for(String item : list) {
            System.out.println(item);
        }

        // 2. way fori
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

    //write a method to insert an element into the array list at the first position
    public static void addToFirstPosition(ArrayList<String> list, String color) {
        list.add(0, color);
    }

}

