package day51.tasks.task1;

import day51.tasks.task1.device.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private final List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public double getTotalPrice() {
        int sum = 0;
        for(Product product : productList) {
            sum += product.getPrice();
        }
        return sum;
    }


    public void checkOut(double money) {
        if(money >= getTotalPrice()) {
            System.out.println("Your order is confirmed, and shipped to your address");
        } else {
            throw new MoneyNotEnoughException("money is not enough");
        }
    }


    public void printList() {
        for(Product product : productList) {
            //1. way
            //AbstractDevice p = (AbstractDevice) product;
            //p.getModel();

            //2. way downcast in default method in Product
            //product.getModel();

            //3. way create abstract method and implement it in derived class

            //model + price
            System.out.println(product.getModel() + ": $" + product.getPrice());
        }
    }
}
