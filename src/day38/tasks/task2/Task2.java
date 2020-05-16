package day38.tasks.task2;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. create method that gets price from user until input given by user is "exit"
2. add prices to ArrayList
3. create method to get average prices
 */
public class Task2 {

    public static void main(String[] args) {
        Task2 t = new Task2();
        ArrayList<Double> prices = t.getPrices();
        System.out.println(prices);

        double average = t.getAverage(prices);
        System.out.println("Average:" + average);

//        System.out.println(0.0 / 0.0);
    }

    public ArrayList<Double> getPrices() {
        ArrayList<Double> prices = new ArrayList<>();
        System.out.println("Provide prices: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equals("exit")) {
            try {
                double price = Double.parseDouble(input);
                prices.add(price);
            } catch(NumberFormatException e) {
                System.out.println("Provided number is not correct, please type again");
            }

            input = scanner.nextLine();
        }

        return prices;
    }

    public double getAverage(ArrayList<Double> prices) {
        double sum = 0.0;
        for(Double price : prices) {
            sum += price;
        }

        if(sum == 0.0) {
            throw new ArithmeticException("No prices provided, no average");
        }

        double average = sum / prices.size();

        return average;
    }
}
