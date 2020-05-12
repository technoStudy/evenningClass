package day35;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToDateAndTime {

    public static void main(String[] args) {
        String strDate = "5/11/2020";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate localDate = LocalDate.parse(strDate, formatter);

        String strTime = "11:00";
        LocalTime localTime = LocalTime.parse(strTime);

    }
}
