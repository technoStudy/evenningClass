package day30.example.example3;

import org.junit.Assert;
import org.junit.Test;

public class JavaJUnit {

    @Test
    public void testSum() {
        int a = 5, b = 3, c = 7;
        int sum = (a + b + c);

        Assert.assertEquals(15, sum);
    }

    @Test
    public void testContains() {
        String text = "Hello World";
        boolean actual = text.contains("or");

        Assert.assertTrue("Your text does not contain 'or' ", actual);
//        Assert.assertEquals(true, actual);
    }

    @Test
    public void testNull() {
        String str = "";
        Assert.assertNotNull(str);
        str.isEmpty();
    }

    @Test
    public void testGetArea() {
        Rectangle rect1 = new Rectangle();
        rect1.width = 5;
        rect1.length = 4;

        int area = rect1.getArea();

        Assert.assertEquals("output is wrong, check getArea method", 20, area);

    }

    @Test
    public void testGetArea2() {
        Rectangle rect1 = new Rectangle();
        rect1.width = 5;
        rect1.length = 10;

        int area = rect1.getArea();

        Assert.assertEquals("output is wrong, check getArea method", 50, area);
    }
}
