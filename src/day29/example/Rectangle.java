package day29.example;

public class Rectangle {
    int length;
    int width;

    public int getArea() {
        return length * width;
    }

    //non static field cannot not be used in static methods
//    public static void print(){
//        System.out.println(length);
//    }


    public static Rectangle createRectangle(int l, int w){
        Rectangle rectangle = new Rectangle();
        rectangle.length = l;
        rectangle.width = w;

        return rectangle;
    }

    public static Rectangle createSquare(int side){
        Rectangle rectangle = new Rectangle();
        rectangle.length = side;
        rectangle.width = side;

        return rectangle;
    }
}
