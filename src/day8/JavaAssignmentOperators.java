package day8;

public class JavaAssignmentOperators {
    /*

+=
Addition assignment
i+=5;
i=i+5

-=
Subtraction assignment
j-=10;
j=j-10;

*=
Multiplication assignment
k*=2;
k=k*2;

/=
Division assignment
x/=10;
x=x/10;

%=
Remainder assignment
a%=4;
a=a%4;

     */

    public static void main(String[] args) {
        // += Addition assignment
        int i = 5;
        i += 5; // i = i + 5;
        System.out.println( "i+=5 is: " + i );

        // -= Subtraction assignment
        int j = 10;
        j -= 3; // j = j - 3;
        System.out.println( "j-=3 is: " + j );

        // *= Multiplication assignment
        int k = 3;
        k *= 4; // k = k * 4 => k = 3 * 4
        System.out.println( "k*=4 is: " + k );

        // /= Division assignment
        int x = 12;
        x /= 4; // x = x / 4;
        System.out.println( "x/=4 is: " + x );

        // %= Remainder assignment
        int m = 7;
        m %= 5; // m = m % 5 => m = 7 % 5
        System.out.println( "m%=5 is: " + m );

    }

}
