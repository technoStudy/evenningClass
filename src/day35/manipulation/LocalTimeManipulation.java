package day35.manipulation;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class LocalTimeManipulation {
    //using date time as: 15:00
    //1. test it with plus minute and hour
    //2. test it with minus minute and hour

    @Test
    public void testPlus() {
        LocalTime time = LocalTime.of(15, 0);
        LocalTime actual = time.plusHours(1).plusMinutes(1);

        Assert.assertEquals("16:01", actual.toString());
    }

    @Test
    public void testMinus() {
        LocalTime time = LocalTime.of(15, 0);
        LocalTime actual = time.minusHours(1).minusMinutes(1);

        Assert.assertEquals(13, actual.getHour());
        Assert.assertEquals(59, actual.getMinute());
    }

}
