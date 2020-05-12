package day35.manipulation;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulation {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, Month.APRIL, 10);

        date1.plusYears(1);
        date1.plusMonths(1);
        date1.plusDays(1);

        System.out.println(date1);

    }

}
