package day33.javaEnum.ex1;

public class User {
    private String name;
    private String bankAccount;

    private PaymentStatus paymentStatus = PaymentStatus.PENDING;

    public User(String name, String bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public void pay(){
        this.paymentStatus = PaymentStatus.PAID;
    }

}
