package day21;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayList {

    public static void main(String[] args) {
        // dynamic size array
        ArrayList<String> list = new ArrayList<>();

        // append elements to arrayList
        list.add("Fetih");
        list.add("Yusuf");
        list.add("Sema");
        list.add("Baha");

        // insert element at specific position
        list.add(0, "Ali");
        list.add(2, "Ibrahim1");
        list.add(2, "Ibrahim2");

        // gives IndexOutOfBoundsException, because there is no 99 index
        list.add(6, "Mustafa");

        // to get/retrieve/access to element in specific position
        String name = list.get(0);

        // to update/change/set element at specific position
        list.set(0, "Abduhamid");

        // to get size/length of arrayList
        int arrayListSize = list.size();

        // to remove/delete element at specific position
        list.remove(0);//remove element at index 0

        // to remove/delete element (only first occurrence)
        list.remove("Yusuf");

        // to get index of specific element  (only first occurrence)
        int indexOfAli = list.indexOf("Ali");

        //print without any extra method
        System.out.println("List1: "+list);

        // to remove everything from arrayList
        list.clear();

        System.out.println("List2: "+list);

    }

}
