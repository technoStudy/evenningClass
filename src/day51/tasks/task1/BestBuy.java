package day51.tasks.task1;

import day51.tasks.task1.device.Carrier;
import day51.tasks.task1.device.Condition;
import day51.tasks.task1.device.DisplayType;
import day51.tasks.task1.device.Product;
import day51.tasks.task1.device.laptop.MacBook;
import day51.tasks.task1.device.phone.IPhone;
import day51.tasks.task1.device.tablet.IPad;

public class BestBuy {

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.setModel("IPhone 11 max pro");
        iphone.setPrice(1200);
        iphone.setCarrier(Carrier.UNLOCKED);
        iphone.setCondition(Condition.NEW);
//        System.out.println(iphone);


        MacBook macBook = new MacBook();
        macBook.setModel("MacBook Pro 16'");
        macBook.setRAM(16);
        macBook.setDisplayType(DisplayType.RETINA);
        macBook.setCPU("Intel i7");
        macBook.setCondition(Condition.REFURBISHED);
        macBook.setPrice(3000);
//        System.out.println(macBook);


        Product ipad = new IPad("Ipad pro", 1000, Condition.NEW, true);

        ShoppingCard card1 = new ShoppingCard();
        card1.addProduct(ipad);
        card1.addProduct(macBook);
        card1.printList();
        System.out.println("Total: "+ card1.getTotalPrice());

        card1.removeProduct(ipad);
        System.out.println("\nremoved ipad");
        card1.printList();
        System.out.println("Total: "+ card1.getTotalPrice());

        card1.checkOut(2000);

    }
}
