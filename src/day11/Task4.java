package day11;

public class Task4 {
    /*
    Given date, check if user provided correct date format
        MM/YYYY
        1-12
    ex: 03/2020 => correct
        25/2020 => wrong
     */
    //part 2: what if user provides input like: 8888/2020, can you handle it?
    // 1. get the month part
    // 2. convert month value to int
    // 3. to check it's in correct range of month
    // 4. print correct or wrong


    public static void main(String[] args) {
        String str = "22/2020";

        // 1. get the month part
        String monthPart = str.substring( 0, 2 );
        System.out.println( monthPart );

        // 2. convert month value to int
        int monthDigit = Integer.valueOf( monthPart );

        // 3. to check it's in correct range of month
        if(monthDigit >= 1 && monthDigit <= 12) {
            // 4. print correct or wrong
            System.out.println("correct");
        }else {
            System.out.println("wrong");
        }

    }

}
