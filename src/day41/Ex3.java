package day41;

public class Ex3 {
    public static void main(String[] args) {
        User user1 = new User("dos", "passasdf");
        user1.setId(1);
        System.out.println("username: " + user1.getUsername());
        System.out.println("password: " + user1.getPassword());
        System.out.println("active: " + user1.isActive());
        System.out.println("certificate: " + user1.hasCertificate());
    }
}
