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

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
