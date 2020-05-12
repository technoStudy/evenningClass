package day35;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ComparingDateAndTime {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, Month.APRIL, 10);
        LocalDate date2 = LocalDate.of(2020, Month.DECEMBER, 19);

        boolean equalDate = date1.isEqual(date2);
        boolean beforeDate = date1.isBefore(date2);
        boolean afterDate = date1.isAfter(date2);
        boolean leapYearDate = date1.isLeapYear();

        LocalTime time1 = LocalTime.of(20,00);
        LocalTime time2 = LocalTime.of(22,00);
        boolean beforeTime = time1.isBefore(time2);
        boolean afterTime = time1.isAfter(time2);

        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
        boolean equal = dateTime1.isEqual(dateTime2);
        boolean before = dateTime1.isBefore(dateTime2);
        boolean after = dateTime1.isAfter(dateTime2);





    }
}
