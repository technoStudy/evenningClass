package day32.tasks.task1;

import java.util.Arrays;

public class Task1 {
    final String[] months = {
            "January", "February",
            "March", "April", "May",
            "June", "July", "August",
            "September", "October", "November",
            "December"};

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        System.out.println(Arrays.toString(t1.months));

        t1.months[0] = "Enero";
        System.out.println(Arrays.toString(t1.months));

        // cannot change because of final
        //t1.months = new String[]{"Month1", "Month2"};
        //System.out.println(Arrays.toString(t1.months));
    }
}
