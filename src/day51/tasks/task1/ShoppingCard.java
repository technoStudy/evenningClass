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
        if(money < getTotalPrice()){
            throw new RuntimeException("not enough money");
        }

        System.out.println("Thank you for purchase, see you soon :) ");
    }

}
