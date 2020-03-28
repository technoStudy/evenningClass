package day9;

public class StringToPrimitive {

    public static void main(String[] args) {
        // String to double
        String d = "10.55";
        double d1 = Double.parseDouble( d );
        double d2 = Double.valueOf( d );
        System.out.println( "d1==d2: " + (d1 == d2) );

        // String to float
        String f = "5.4";
        float f1 = Float.parseFloat( f );
        float f2 = Float.valueOf( f );
        System.out.println( "f1==f2: " + (f1 == f2) );

        // String to int
        String i = "20";
        int i1 = Integer.parseInt( i );
        int i2 = Integer.valueOf( i );
        System.out.println( "i1==i2: " + (i1 == i2) );

        // String to boolean
        boolean b1 = Boolean.parseBoolean( "TrUe" );
        boolean b2 = Boolean.valueOf( "tRuE" );
        System.out.println( "b1==b2: " + (b1 == b2) );

    }
}
