package day42.tasks.task1;

/*
1. create class Account with public fields: number, balance (do not create anything extra yet)
 */
public class Account {
    private String number;
    private double balance;
    private Currency currency;

    public Account(Currency currency) {
        this.currency = currency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = currency + number;
    }

    public double getBalance() {
        return balance;
    }

    //withdraw and deposit
    public void withdraw(double amount) {
        //assume bank doesnt allow negative balance
        if(balance < amount) { // balance - amount < 0
            throw new RuntimeException("Not enough money in balance to withdraw, balance: " + currency.getSymbol() + balance);
        }

        balance -= amount;
    }

    public void deposit(double amount) {
        //assume bank has limit as 5000 for single transaction
        if(amount > 5000) {
            throw new RuntimeException("Exceed single transaction amount, amount: " + currency.getSymbol() + amount);
        }

        balance += amount;
    }


    public String toString() {
        return "\nnumber=" + getNumber() +
                "\nbalance=" + getBalance();
    }
}
