package day28.tasks.task2;

// create class Task2 and create objects of Rectangle and print perimeters
public class Task2 {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.width = 5;
        rect1.length = 10;
        rect1.print();

        Rectangle rect2 = new Rectangle();
        rect2.width = 50;
        rect2.length = 50;
        rect2.print();

        Rectangle rect3 = new Rectangle();
        rect3.width = 3;
        rect3.length = 4;
        rect3.print();
    }

}
