package day42.tasks.task3;

import java.util.ArrayList;
import java.util.List;

/*
Create class MyNumber with one attributes List<Integer> evenNumbers,
and make it read-only
 */
public class MyNumber {
    private List<Integer> evenNumbers;

    public MyNumber(List<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public List<Integer> getEvenNumbers() {
        List<Integer> copyList = new ArrayList<>();
        copyList.addAll(evenNumbers);

        return copyList;
    }


    public String toString() {
        return "MyNumber{" +
                "evenNumbers=" + evenNumbers +
                '}';
    }
}
