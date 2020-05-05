package day30.tasks.task2;


//create a class Bank, in different file
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string

// in Task2 class create at least 4 object of Bank class
// call method to get attributes and print it
public class Task2 {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        System.out.println(bank1);

        Bank bank2 = new Bank("Chase", 56778312);
        System.out.println(bank2);

        Bank bank3 = new Bank("BOA", 123123, false);
        System.out.println(bank3);
    }

}
