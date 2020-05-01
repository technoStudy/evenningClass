package day28.tasks.task1;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    /*
    ***Part 3***
    create class Task1, and create a Customer with all attributes and print/debug;
    */
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.name = "Joshua";
        //2.way to assign customer1.electricityAccount
        // ElectricityAccount electricityAccount = new ElectricityAccount();
        // customer1.electricityAccount = electricityAccount;

        customer1.consumeElectricity(100);
        customer1.consumeElectricity(400);
        customer1.electricityAccount.calculateBill();
        System.out.println(customer1);

        Customer customer2 = new Customer();
        customer2.name = "Max";
        customer2.consumeElectricity(30);
        customer2.consumeElectricity(45);
        customer2.consumeElectricity(-50);
        customer2.electricityAccount.calculateBill();
        System.out.println(customer2);




    }

}









