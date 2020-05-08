package day32.nonAccessModifier.staticModifier;

public class Simple {
    //instance member/variable/field
    int a = 0;

    //class member/variable/field
    static int b = 0;

    void increase() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        Simple s1 = new Simple();
        Simple s2 = new Simple();

        s1.increase();
        s2.increase();

    }

}
