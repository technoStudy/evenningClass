package day36.tasks.task1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

/*
Write a Java method to calculate the difference between two dates
 */
public class Task1 {

    public Period differenceOfTwoDates(LocalDate date1, LocalDate date2) {
        return Period.between(date1, date2);
    }

    @Test
    public void testDifferenceOfTwoDates() {
        LocalDate date1 = LocalDate.of(2020, 5, 10);
        LocalDate date2 = LocalDate.of(2020, 5, 12);

        Period actual = differenceOfTwoDates(date1, date2);

        Assert.assertEquals(2, actual.getDays());
    }

}
