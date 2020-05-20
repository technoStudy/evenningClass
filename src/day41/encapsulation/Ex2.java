package day41.encapsulation;

public class Ex2 {

    public static void main(String[] args) {
        User user1 = new User("abdu","123456789098765432");

        user1.setPassword("123");

        System.out.println("username: "+user1.getUsername());
        System.out.println("password: "+user1.getPassword());
    }

}
