package day28.tasks.task1;

public class Task1 {

    /*
    ***Part 3***
    create class Task1, and create a Customer with all attributes and print/debug;
    */
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.name = "Joshua";
        customer1.electricityAccount = new ElectricityAccount();

        //2.way to assign customer1.electricityAccount
        // ElectricityAccount electricityAccount = new ElectricityAccount();
        // customer1.electricityAccount = electricityAccount;


        customer1.consumeElectricity(100);
        customer1.consumeElectricity(500);
        customer1.consumeElectricity(60);

        customer1.electricityAccount.calculateBill();

        

    }

}
