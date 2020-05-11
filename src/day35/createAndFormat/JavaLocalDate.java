package day35.createAndFormat;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDate {
    //LocalDate - Contains just a date, no time and no time zone. (19/12/1989, birthday this year)

    public static void main(String[] args) {
        //creating LocalDate
        LocalDate localDate1 = LocalDate.of(2020, 3, 15);
        LocalDate localDate2 = LocalDate.of(2020, Month.MARCH, 15);


        //methods of LocalDate
        LocalDate today = LocalDate.now();
        int year = today.getYear();

        Month month = today.getMonth();
        int monthValue = today.getMonthValue();

        int dayOfYear = today.getDayOfYear();
        int dayOfMonth = today.getDayOfMonth();
        DayOfWeek dayOfWeek = today.getDayOfWeek();


        //Formatting LocalDate
        System.out.println("Without formatter -> " + today);
        System.out.println("SHORT Date -> " + today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM Date -> " + today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG Date -> " + today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL Date -> " + today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        //MM-month
        //dd-day
        //yy-year
        System.out.println("dd.MM.yy -> " + today.format(DateTimeFormatter.ofPattern("dd.MM.yy")));
        System.out.println("dd MM yy -> " + today.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
    }
}

