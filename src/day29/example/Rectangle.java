package day29.example;

public class Rectangle {

    int length;
    int width;

    public int getArea() {
//        return MyMath.abs(length) * MyMath.abs(width);
        return length * width;
    }


    public static void print(){
        System.out.println("You are using Rectangle print");
    }
}
