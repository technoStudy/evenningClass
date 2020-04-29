package day28.tasks.task2;

// create class Task2 and create objects of Rectangle and print perimeters
public class Task2 {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.width = 5;
        rect1.length = 10;
        int rect1Perimeter = rect1.getPerimeter();

        System.out.println("Perimeter: " + rect1Perimeter);
    }

}
