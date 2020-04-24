package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayAndArrayList {

    public static void oneDimensional() {
        // array
        int[] array1 = new int[5];
        int[] array2 = {4, 2, 9, 5};

        //ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        // 1. way of creating ArrayList
        ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.asList(4, 2, 9, 5);
        // 2. way of creating ArrayList
        List<Integer> list3 = Arrays.asList(4, 2, 9, 5);
    }

    public static void twoDimensional() {
//        // 2D array
//        //1. way
//        int[][] array1 = new int[5][5];
//        //2. way
//        int[][] array2 = {
//                {4, 2, 9, 5},
//                {4, 2, 9, 5},
//        };
//        //3. way
//        int[] row1 = {4, 2, 9, 5};
//        int[] row2 = {4, 2, 9, 5};
//        int[][] array3 = {
//                row1,
//                row2,
//        };


        // 2D ArrayList
        ArrayList<Integer> subList1 = new ArrayList<>();
        subList1.add(1);
        subList1.add(2);
        subList1.add(3);

        ArrayList<Integer> subList2 = new ArrayList<>();
        subList2.add(10);
        subList2.add(20);
        subList2.add(30);

        ArrayList<ArrayList<Integer>> generalList = new ArrayList<>();
        generalList.add(subList1);
        generalList.add(subList2);

    }

    public static void example2DArrayList() {
        ArrayList<String> room1 = new ArrayList<>();
        room1.add("ahmet");
        room1.add("mehmet");
        room1.add("ali");

        ArrayList<String> room2 = new ArrayList<>();
        room2.add("baha");
        room2.add("dos");
        room2.add("aydin");

        ArrayList<String> room3 = new ArrayList<>();
        room3.add("serdar");
        room3.add("yusuf");

        ArrayList<ArrayList<String>> students = new ArrayList<>();
        students.add(room1);
        students.add(room2);
        students.add(room3);




    }

    public static void main(String[] args) {
        twoDimensional();
    }

}
