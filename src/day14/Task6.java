package day14;

public class Task6 {
    //print all even numbers between 0 and 100
    //using for loop and continue statement

    //hint: if(i % 2 == 0)  // even number
    //      if(i % 2 != 0) // odd number

    public static void main(String[] args) {

        for(int i = 0; i <= 100; i++) {
            //skip when i is not even number
            //write you code here
            if(i % 2 != 0){
                continue;
            }

                //end of you code
            System.out.println(i);
        }
    }
}


//