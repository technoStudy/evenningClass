package day28.tasks.task1;

/*
create class ElectricityAccount with attributes:
1. totalWph -> watt per hour
2. rate = 0.7
3. bill

*/
public class ElectricityAccount {
    double totalWph;
    double rate = 2.0;
    double bill;

    /*
    ***Part 5***
    create method in ElectricityAccount that calculates bill
    where bill is rate * totalWph
    */
    double calculateBill() {
        bill = rate * totalWph;

        return bill;
    }
}
