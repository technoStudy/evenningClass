package day28.tasks.task2;

//create class Rectangle with attributes:length and width
public class Rectangle {
    int length;
    int width;

    // create method in class Rectangle that calculate perimeter
    public int getPerimeter() {
        return 2 * (length + width);
    }

    // create method that calculates area
    public int getArea() {
        return length * width;
    }


    public void print() {
        System.out.println("--------------------------");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("--------------------------");
    }

    public String toString() {
        String output = "\n--------------------" +
                "\nLength: " + length +
                "\nWidth: " + width +
                "\nPerimeter: " + getPerimeter() +
                "\nArea: " + getArea() +
                "\n--------------------------";
        return output;
    }
}
