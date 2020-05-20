package day41.tasks.task1;

import java.time.LocalDate;
import java.time.Month;

/*
2: **Create books as with following data:**
Mark Twain: Five Novels (Leather-bound Classics)
by Mark Twain and Elizabeth Boyle Machlan PhD | Nov 1, 2011
Leather Bound $16.69
Hardcover $10.49
Audible Audiobook $0.00


Jane Austen: The Complete Works 7-Book Boxed Set: Classics hardcover boxed set (Penguin Clothbound Classics)
by Jane Austen and Coralie Bickford-Smith | Nov 24, 2015
Hardcover $109.61

Little Women (Puffin in Bloom)
by Louisa May Alcott  | Aug 28, 2014
Hardcover $11.99
Audible Audiobook $0.00
 */
public class AmazonStore {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Mark Twain: Five Novels (Leather-bound Classics)");
        book1.setAuthor("Mark Twain and Elizabeth Boyle Machlan PhD");
        book1.setPublishedDate(LocalDate.of(2011, Month.NOVEMBER, 1));
        book1.setLeatherBoundPrice(16.69);
        book1.setHardCoverPrice(10.49);
        book1.setAudioBookPrice(0.0);

        Book book2 = new Book("Mark Twain: Five Novels (Leather-bound Classics)",
                "Mark Twain and Elizabeth Boyle Machlan PhD",
                LocalDate.of(2011, Month.NOVEMBER, 1),
                16.69,
                10.49,
                0.0
                );



//        Jane Austen: The Complete Works 7-Book Boxed Set: Classics hardcover boxed set (Penguin Clothbound Classics)
//        by Jane Austen and Coralie Bickford-Smith | Nov 24, 2015
//        Hardcover $109.61
    }
}
