package day20;

public class JavaMethodOverloading {
    /*

1. The number of parameters in two methods.
2. The data types of the parameters of methods.
3. The Order of the parameters of methods.

     */

    // original method
    public static int sum(int a, int b) {
        return a + b;
    }

    //    1. The number of parameters in two methods.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //    2. The data types of the parameters of methods.
    public static double sum(double a, double b) {
        return a + b;
    }

//    can not create overloaded method like this
//    public static double sum(int a, int b) {
//        return (double) (a + b);
//    }

    //original
    public static void identity(String name, int id) {
    }

    //    3. The Order of the parameters of methods.
    public static void identity(int id, String name) {
    }


    public static void main(String[] args) {
        int sumOfTwo = sum(5, 4);
        int sumOfThree = sum(5, 4, 5);
        double sumOfTwoDecimal = sum(5.3, 4.7);
    }
}
