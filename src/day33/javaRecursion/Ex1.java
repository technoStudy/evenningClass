package day33.javaRecursion;

public class Ex1 {

    //method to print from 1 to 5;
    static void print1to5() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    static int print1to5(int i) {
        System.out.println(i);
        if(i == 5) {
            return -1;
        }

        return print1to5(i + 1);
    }


    public static void main(String[] args) {
//        print1to5();
        print1to5(1);
    }
}
