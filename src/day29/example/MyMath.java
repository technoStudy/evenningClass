package day29.example;

public class MyMath {

    public static int abs(int number){
        if(number < 0){
            return number * -1;
        }else {
            return number;
        }

//        return number < 0 ? number * -1 : number;
    }
}
