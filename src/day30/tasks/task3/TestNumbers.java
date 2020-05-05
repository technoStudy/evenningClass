package day30.tasks.task3;

import org.junit.Assert;
import org.junit.Test;

/*
create class TestNumbers
create test to check "checkEvenNumber" method
 */
public class TestNumbers {

    @Test
    public void testCheckEvenNumber_with_4() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkEvenNumber(4);

        // Assert.assertEquals(true, actual);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCheckEvenNumber_with_3() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkEvenNumber(3);

        // Assert.assertEquals(true, actual);
        Assert.assertFalse(actual);
    }

}
