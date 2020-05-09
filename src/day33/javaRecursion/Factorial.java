package day33.javaRecursion;

import org.junit.Assert;
import org.junit.Test;

public class Factorial {

    //n
    //fact = 1 * 2 * 3..... *n;
    //fact = n * n-1 * n-2 .... 3 * 2 * 1;


    int factorialForLoop(int n){
        int fact = 1;
        for (int i = n; i >=1; i--){
            fact*=i;
        }

        return fact;
    }


    int factorialRecursion(int n){
        if(n == 1){
            return 1;
        }

        return n * factorialRecursion(n-1);
    }
    /* /// n * f(n-1);
    f(n) = n * f(n-1);



     5 * f(5-1);
     5 * [4 * f(4-1)];
     5 * 4 * [3 * f(3-1)];
     5 * 4 * 3 * [2 *f(2-1)];
     5 * 4 * 3 * [2 *f(2-1)];
     5 * 4 * 3 * 2 * 1;


     */

    @Test
    public void testFactorial_recursion(){
        int factorial = factorialRecursion(5); //120

        Assert.assertEquals(120, factorial);

    }


    @Test
    public void testFactorial_forLoop(){
        int factorial = factorialForLoop(5); //120

        Assert.assertEquals(120, factorial);

    }



}
