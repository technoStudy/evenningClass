package day31.tasks.task3;

public class ExQ3 {

    private static double getGravity() {
        return 9.8;
    }

    public double speed(double time) {
        return time * getGravity();
    }

    public static void main(String[] args) {
        System.out.println("Gravity: " + getGravity());

        ExQ3 ex = new ExQ3();
        System.out.println("Free fall speed: " + ex.speed(15));
    }

}
