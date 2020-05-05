package day31.tasks.task1.other;

import day31.tasks.task1.same.BankUser;

public class PostalService {


    public static void main(String[] args) {
        BankUser bankUser = new BankUser();

        // cannot create BankAccount, because it is default/package-private
        // BankAccount bankAccount = new BankAccount();
    }
}
