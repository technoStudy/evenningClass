package day16;

public class JavaForEach {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Trudy"};

        //for-each loop
        for(String name : names) {
            System.out.println( name );
        }




        //regular for loop
//        for(int i = 0; i < names.length; i++) {
//            System.out.println( names[i] );
//        }

    }

}
