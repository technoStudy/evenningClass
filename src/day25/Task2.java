package day25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    // create method that returns map of colors
    // using colors array = {Red, Yellow, Green, Blue}
    // position, color
    //ex: 1 Red
    //    2 Yellow
    //    3 Green
    //    4 Blue
    public static HashMap<Integer, String> getColorMap() {
        String[] array = {"Red", "Yellow", "Green", "Blue"};

        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
            int position = i + 1;
            String color = array[i];

            map.put(position, color);
        }

        return map;
    }

    // create method that prints positions of colors in map
    public static void printPositions(HashMap<Integer, String> colors) {
        Set<Integer> positions = colors.keySet();
        System.out.println("Positions: " + positions);
    }

    // create method that prints colors and position
    //ex: Red 1
    //    Yellow 2
    //    Green 3
    //    Blue 4
    public static void printColorAndPosition(HashMap<Integer, String> colors) {
        for(Map.Entry<Integer, String> colorEntry : colors.entrySet()) {
            Integer key = colorEntry.getKey();
            String value = colorEntry.getValue();

            System.out.println(value + " " + key);
        }
    }


    // create method that prints only values of map

    public static void main(String[] args) {
        HashMap<Integer, String> colorMap = getColorMap();
        System.out.println(colorMap);

        printPositions(colorMap);
        printColorAndPosition(colorMap);
    }
}
