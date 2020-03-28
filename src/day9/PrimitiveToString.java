package day9;

public class PrimitiveToString {

    public static void main(String[] args) {
        // double to String
        double d = 100.9;
        String d1 = String.valueOf( d );
        String d2 = Double.toString( d );
        System.out.println( "d1 == d2: " + d1.equals( d2 ) );

        // float to String
        float f = 10.5F;
        String f1 = String.valueOf( f );
        String f2 = Float.toString( f );
        System.out.println( "f1 == f2: " + f1.equals( f2 ) );

        // int to String
        int i = 40;
        String i1 = String.valueOf( i );
        String i2 = Integer.toString( i );
        System.out.println( "i1 == i2: " + i1.equals( i2 ) );

        // boolean to String
        boolean b = true;
        String b1 = String.valueOf( b );
        String b2 = Boolean.toString( b );
        System.out.println( "b1 == b2: " + b1.equals( b2 ) );


    }
}
