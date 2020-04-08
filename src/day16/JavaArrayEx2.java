package day16;

public class JavaArrayEx2 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Trudy"};
        //                   0       1       2
        for(int i = names.length - 1; i >= 0; i--) {
            System.out.println( i + ". " + names[i] );
        }


//        for(int i = 0; i < names.length; i++) {
//            System.out.println( i + ". " + names[i] );
//        }

    }
}
/*
array size: 3
0. Alice
1. Bob
2. Trudy
0 1 2 (3)


// how can we reverse this:
array size: 3
2. Trudy
1. Bob
0. Alice

2 1 0
3-1 = 2
*/