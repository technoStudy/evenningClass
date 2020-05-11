package day35.createAndFormat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalTime {
    //LocalTime - Contains just a time, no date and no time zone. (midnight 00:00, ts. evening class start time -> 7:00pm)

    public static void main(String[] args) {
        //creating
        LocalTime localTime1 = LocalTime.of(0, 0);
        LocalTime localTime2 = LocalTime.of(19, 50);

        LocalTime localTime = LocalTime.now();
        //methods
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();


        //Formatting LocalTime
        System.out.println("Without formatter -> " + localTime);
        System.out.println("SHORT Time -> " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println("MEDIUM Time -> " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

        //cannot use below formats because they need date
//        System.out.println("LONG Time -> " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
//        System.out.println("FULL Time -> " + localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));

        //HH-24 hour format
        //hh-12 hour format
        //mm-minutes
        //ss-seconds
        //a-AM or PM
        System.out.println("HH:mm:ss -> " + localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("h mm a -> " + localTime.format(DateTimeFormatter.ofPattern("h mm a")));
    }
}
