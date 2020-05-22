package day42.tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);


        MyNumber myNumber = new MyNumber(numbers);
        System.out.println(myNumber);

        List<Integer> evenNumbers = myNumber.getEvenNumbers();
        System.out.println("evenNumbers list: " + evenNumbers);

        myNumber.getEvenNumbers().add(1000);
        System.out.println("evenNumbers list after modification: " + evenNumbers);

        System.out.println(myNumber);
    }
}
