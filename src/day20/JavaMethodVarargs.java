package day20;

public class JavaMethodVarargs {

    /*
    1. Each method can only have one varargs parameter
    2. The varargs argument must be the last parameter

     */
    public static void main(String[] args) {
        countArguments(5); // 1
        countArguments(3, 3); // 2
        countArguments(1, 2, 3, 4, 5);// 5

    }

    public static void countArguments(int... numbers) {// int[] number
        int elementCount = numbers.length;
        System.out.println("# of arguments: " + elementCount);
    }

//        1. Each method can only have one varargs parameter
//        this code will not work
//    public static void method1(String... strs, int... ints){
//
//    }

    //        2. The varargs argument must be the last parameter
    //        this code will not work
//    public static void method1(int... ints, double d) {
//
//    }


}
