package day41.tasks.task1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class TestBook {

    @Test
    public void testHasThreePrices_success(){
        Book book1a = new Book("Mark Twain: Five Novels (Leather-bound Classics)",
                "Mark Twain and Elizabeth Boyle Machlan PhD",
                LocalDate.of(2011, Month.NOVEMBER, 1),
                16.69,
                10.49,
                0.0
        );


        boolean actual = book1a.hasThreePrices();
        Assert.assertTrue(actual);
    }

    @Test
    public void testHasThreePrices_fail(){
        Book book3 = new Book("Little Women (Puffin in Bloom)","Louisa May Alcott", LocalDate.of(2014,Month.AUGUST,28));
        book3.setHardCoverPrice(11.99);
        book3.setAudioBookPrice(0.0);

        Assert.assertFalse(book3.hasThreePrices());
    }
}
