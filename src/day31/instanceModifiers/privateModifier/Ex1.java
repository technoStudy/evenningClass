package day31.instanceModifiers.privateModifier;

public class Ex1 {

    public static void main(String[] args) {
        Math.random();
        Math.min(10, 5);

        //can not create Math instance, because its private
        //Math math = new Math();
    }
}
