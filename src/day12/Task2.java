package day12;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        String str = "ABCDF";
        //01234
        Random random = new Random();
        int randomIndex = random.nextInt(5);

        String examResult = "" +str.charAt(randomIndex);
        //String.valueOf(str.charAt(randomIndex));
        //Character.toString(str.charAt(randomIndex));
        System.out.println("exam result: " + examResult);

        String mark = "";
        if (examResult.equals("A")) {
            mark = ("Excellent!!!");
        }else if (examResult.equals("B")){
            mark = ("Well done");
        }else if (examResult.equals("C")){
            mark = ("Good");
        }else if (examResult.equals("D")){
            mark = ("Need improvement");
        }else if (examResult.equals("F")){
            mark =("Fail");
        }
        System.out.println(mark);


    }
}