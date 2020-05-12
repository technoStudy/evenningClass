package day35;

import java.time.LocalDate;
import java.time.Month;

public class ComparingDateAndTime {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, Month.APRIL, 10);
        LocalDate date2 = LocalDate.of(2020, Month.DECEMBER, 19);

        boolean equal = date1.isEqual(date2);
        boolean before = date1.isBefore(date2);
        boolean after = date1.isAfter(date2);
        boolean leapYear = date1.isLeapYear();

    }
}
