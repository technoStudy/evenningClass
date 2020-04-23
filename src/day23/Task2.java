package day23;

import java.util.ArrayList;
import java.util.HashSet;

public class Task2 {

    //1. create an array of students names(it should have some duplications)
    public static String[] getStudentNames() {
        String[] names = {
                "Caner", "Furkan", "Halit", "Hasan", "Yusuf",
                "Lana", "Marina", "Halit", "Furkan"
        };

        return names;
    }

    //2. convert array to ArrayList and to HashSet
    public static ArrayList<String> convertToArrayList(String[] names) {
        ArrayList<String> result = new ArrayList<>();
        for(String name : names) {
            result.add(name);
        }

        return result;
    }

    public static HashSet<String> convertToHashSet(String[] names) {
        ArrayList<String> list = convertToArrayList(names);
        // 1. way
        HashSet<String> result = new HashSet<>(list);

        // 2. way
        // HashSet<String> result2 = new HashSet<>();
        // result2.addAll(list);

        // 3. way
        // just using for loop and add every item from array to HashSet

        return result;
    }

    //3. check if you have duplication in you array
    public static boolean hasDuplication(String[] names) {
        HashSet<String> set = convertToHashSet(names);
        int setSize = set.size();
        int arraySize = names.length;

        return setSize != arraySize;
    }

    //4. check if you have name "Yusuf" in you set/list,
    // if you have, print he is best mentor ever
    // else, print I wish we had him
    public static void printMentor(HashSet<String> names){
        if(names.contains("Yusuf")){
            System.out.println("he is best mentor ever");
        }else {
            System.out.println("I wish we had him");
        }
    }




    public static void main(String[] args) {
        String[] studentNames = getStudentNames();

        ArrayList<String> arrayList = convertToArrayList(studentNames);
        HashSet<String> hashSet = convertToHashSet(studentNames);
        boolean hasDuplication = hasDuplication(studentNames);

        printMentor(hashSet);
    }



}
