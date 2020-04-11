package day18;

public class JavaStringFormat {

    public static void main(String[] args) {
//        formats your input
//        String.format(  );

        double price = 13.333333333;
        System.out.println( "price before format: " + price );
        System.out.println( "price after format: " + String.format( "%.2f", price ) );
    }
}
