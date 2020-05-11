package day35.createAndFormat;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalDateTime {
    //LocalDateTime - Contains both a date and time but no time zone. (00:00 01/01/2021 new year, 20:10 05/11/2020 iftar)

    public static void main(String[] args) {
        //creating
        LocalDate ld = LocalDate.of(2020, Month.MARCH, 15);
        LocalTime lt = LocalTime.of(19, 50);

        LocalDateTime localDateTime1 = LocalDateTime.of(ld, lt);
        LocalDateTime localDateTime2 = LocalDateTime.of(2000, 01, 01, 3, 45);

        LocalDateTime localDateTime = LocalDateTime.now();

        //methods
        int year = localDateTime.getYear();

        Month month = localDateTime.getMonth();
        int monthValue = localDateTime.getMonthValue();

        int dayOfYear = localDateTime.getDayOfYear();
        int dayOfMonth = localDateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();

        //Formatting LocalDateTime
        System.out.println("Without formatter -> " + localDateTime);
        System.out.println("SHORT DateTime -> " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM DateTime -> " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println("LONG DateTime -> " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
//        System.out.println("FULL DateTime -> " + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));


        //MM-month
        //dd-day
        //yy-year
        //HH-24 hour format
        //hh-12 hour format
        //mm-minutes
        //ss-seconds
        //a-AM or PM
        System.out.println("dd.MM.yy HH:mm -> " + localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yy HH:mm")));
        System.out.println("h:m dd/MM -> " + localDateTime.format(DateTimeFormatter.ofPattern("h:m dd/MM")));
    }
}
