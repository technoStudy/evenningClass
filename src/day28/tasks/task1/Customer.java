package day28.tasks.task1;

/*
***Part 2***
create class Customer with instance variables:
1. name
2. electricityAccount
* */
public class Customer {
    String name;
    ElectricityAccount electricityAccount = new ElectricityAccount();

    /*
    ***Part 4***
    create method in Customer as "consumeElectricity" with parameter as (wph)
    every time when customer consumes electricity, it should add to totalWph
    //ex: customer.consumeElectricity(100);
          customer.consumeElectricity(200);
          customer.consumeElectricity(50);
   // totalWph = 350
     */
    void consumeElectricity(double wph){
        electricityAccount.totalWph += wph;
    }


    public String toString(){
        return "-------------------"+
                "\nName: " + name +
                "\nBill: $" + electricityAccount.bill+
                "\n------------------";

    }

}
