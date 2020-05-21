package day42.tasks.task1;

public class Bank {

    public static void main(String[] args) {
        Account account1 = new Account(Currency.USD);
        account1.setNumber("43654038649");
        account1.setBalance(1000);

        Account account2 = new Account(Currency.EU);
        account2.setNumber("12358749534");
        account2.setBalance(500);
    }
}
