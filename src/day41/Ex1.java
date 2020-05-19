package day41;


public class Ex1 {

    public static void main(String[] args) {
//        User user1 = new User();
//        user1.setUsername("dos@techno");
//        user1.setPassword("123123");

        User user2 = new User("yusuf@techno","123456789012");
        user2.setPassword("343"); //no setter methods right now
//        user2.password = "123";
        System.out.println("username: "+user2.getUsername());
        System.out.println("password: "+user2.getPassword());
//        user2.username;

    }
}
