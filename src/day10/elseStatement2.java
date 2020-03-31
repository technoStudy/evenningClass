package day10;

public class elseStatement2 {

    public static void main(String[] args) {

        {

        /*
            else statement

               if false

               else if statement false

               else
                java will print this one

         */

            int age = 20;

            if(age>=60){
                System.out.println("you are senior citizen");

            }else if (age >= 50){
                System.out.println("you are in your 50's");

            }else if(age >= 40){
                System.out.println("you are in your 40's");

            }else{
                System.out.println("you are still young ");
            }



        }

    }
}
