package day21;

public class JavaAutoboxingUnboxing {

    public static void printInt(int number) {
        System.out.println("Primitive int: " + number);
    }

    public static void printDouble(Double decimal) {
        System.out.println("Reference type Double: " + decimal);
    }

    public static void main(String[] args) {
        Double decimal = Double.valueOf(1.3);
        printDouble(decimal);

        double four = 4.0d;
        //autoboxing -> converting primitive to wrapper class
        printDouble(four);


        int five = 5;
        printInt(five);

        Integer ten = Integer.valueOf(10);
        //unboxing -> converting wrapper class to primitive
        printInt(ten);
    }
}
