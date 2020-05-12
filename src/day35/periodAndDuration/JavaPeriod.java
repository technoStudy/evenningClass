package day35.periodAndDuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/*
The Period class uses the units year, month and day to represent a period of time.
We can obtain a Period object as the difference between two dates by using the between() method
 */
public class JavaPeriod {

    public static void main(String[] args) {
        LocalDate millennium = LocalDate.of(2000, 01, 01);
        LocalDate today = LocalDate.now();

        Period between = Period.between(millennium, today);
        int years = between.getYears();
        int months = between.getMonths();
        int days = between.getDays();

        Period threeDayPeriod = Period.ofDays(3);
        Period quarter = Period.ofMonths(3);

        LocalDate tsCourseStart = LocalDate.of(2020, Month.MARCH, 15);
        Period coursePeriod = Period.ofMonths(6);
        LocalDate tsCourseEnd = tsCourseStart.plus(coursePeriod);

        System.out.println(tsCourseEnd);
        System.out.println(tsCourseEnd.getDayOfWeek());


        LocalDate date1 = LocalDate.of(2020, 5, 3);
        LocalDate date2 = LocalDate.of(2020, 5, 9);

        Period between03And09 = Period.between(date1, date2);
    }
}
