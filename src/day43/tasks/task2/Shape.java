package day43.tasks.task2;

public class Shape {

    public double getArea(){
        throw new RuntimeException("method is not overridden");
    }

    public double getPerimeter(){
        throw new UnsupportedOperationException("not overridden yet");
    }
}
