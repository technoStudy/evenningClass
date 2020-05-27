package day43.tasks.task2;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {
        Square square1 = new Square(5);
    }
}
