package day35.periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

/*
The Duration class represents an interval of time in seconds or nanoseconds and is most suited for handling shorter amounts of time, in cases that require more precision.
We can determine the difference between two instants as a Duration object using the between() method
 */
public class JavaDuration {

    public static void main(String[] args) {

        LocalTime eveningClassStart = LocalTime.of(19, 0);
        LocalTime eveningClassEnd = LocalTime.of(21, 50);

        Duration between = Duration.between(eveningClassStart, eveningClassEnd);
        long seconds = between.getSeconds();
        long minutes = seconds / 60;
        long hours = minutes / 60;


        Duration projectDuration = Duration.ofHours(3);
        LocalTime start = LocalTime.of(10,00);
        LocalTime end = start.plus(projectDuration);

        System.out.println(end);
    }
}
