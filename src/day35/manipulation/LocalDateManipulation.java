package day35.manipulation;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateManipulation {

    @Test
    public void testPlus() {
        LocalDate date1 = LocalDate.of(2020, Month.APRIL, 10);
        LocalDate actual = date1.plusYears(1).plusMonths(1).plusDays(1);
        System.out.println(actual);

        String expected = "2021-05-11";
        Assert.assertEquals(expected, actual.toString());
    }

    @Test
    public void testMinus(){
        LocalDate date = LocalDate.of(2020, Month.APRIL, 10);
        LocalDate actual = date.minusYears(1).minusMonths(1).minusDays(1);

        String expected = "2019-03-09";
        Assert.assertEquals(expected, actual.toString());
    }

}
