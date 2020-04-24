package day22;

import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Russian");
        list1.add("Turkmen");
        list1.add("Tajik");
        list1.add("Turkish");
        list1.add("Russian");



        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Russian");
        list2.add("Turkmen");

        list1.removeAll(list2); //list1 = list1 - list2


    }
}
