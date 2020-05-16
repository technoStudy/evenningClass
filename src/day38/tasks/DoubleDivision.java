package day38.tasks;

public class DoubleDivision {

    public static void main(String[] args) {
//        System.out.println("0.0/0.0 = " + 0.0 / 0.0);
//        System.out.println("3.3/0.0 = " + 3.3 / 0.0);
//        System.out.println("0.0/2.2 = " + 0.0 / 2.2);

        try {
            throw new RuntimeException("1");
        } catch(RuntimeException ex) {
            ex.printStackTrace();
            throw new ArithmeticException("2");
        } finally {
            throw new IllegalArgumentException("3");
        }

    }
}
