package day32.examples;

public class Ex1 {
    // which of these method is not valid 'main/entry' method


//    public final static void main(String[] args) {
//        //valid
//    }

//    public static final void main(String[] args) {
//        //valid
//    }

    // they don`t have public access
//    protected static final void main(String[] args) {
//    }
//    static final void main3(String[] args) {
//    }
//    static void main4(String[] args) {
//    }
//    void main5(String[] args) {
//    }

    public static void main(String[] myArgs) {
        //valid
    }

//    public static void main(String a) {
    //not valid, parameter should be String array
//    }

    //public static void main(String... a) { // String[] a
    //valid, varargs is just another array
    //}

}
