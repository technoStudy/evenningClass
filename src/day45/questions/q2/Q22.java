package day45.questions.q2;

public class Q22 {

    String s;

    public Q22(){
        s = "Class q22";
        System.out.println("constructor block");
    }

    {
        System.out.println(s);
        System.out.println("init block");
    }

    public static void main(String[] args) {
        new Q22();
    }
}
