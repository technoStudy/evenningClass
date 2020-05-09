package day33.tasks.task1;

import java.util.Arrays;

/*
Given number arguments to main method,
find maximum/greatest number of given 'number arguments'
 */
public class Task {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        main(nums);
    }

    public static void main(int[] args){
        Arrays.sort(args);
        System.out.println("Sorted: " + Arrays.toString(args));

        int max = args[args.length - 1];

        System.out.println("Maximum is: " + max);
    }
}
