package day33.javaRecursion;

public class Ex1 {

    //method to print from 1 to 5;
    static void print1to5() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    //recursion calling method in method
    static void print1to5(int n) {
        System.out.println(n);

        if (n < 5) {
            print1to5(n + 1);
        }

    }

    public static void main(String[] args) {
//        print1to5();
        print1to5(1);
    }
}
