package day27.tasks.task3;

public class Task3 {

    public static void main(String[] args) {
        User user1 = createUser("thebroken", "winterfell", "Brann", "Stark",
                "04/12/1005", "Wind St", "broken@shores", "+1 555 44 66");
        printUser(user1);

    }

    public static User createUser(String username, String password, String firstName, String lastName,
                                  String birthDate, String address, String email, String phone) {
        User user1 = new User();
        user1.username = username;
        user1.password = password;
        user1.firstName = firstName;
        user1.lastName = lastName;

        user1.birthDate = birthDate;
        user1.address = address;
        user1.email = email;
        user1.phone = phone;

        return user1;
    }

    public static void printUser(User user) {
        System.out.println("Username: " + user.username);
        System.out.println("Password: " + user.password);
        System.out.println("FirstName: " + user.firstName);
        System.out.println("LastName: " + user.lastName);

        System.out.println("Birth Date: " + user.birthDate);
        System.out.println("Address: " + user.address);
        System.out.println("Email: " + user.email);
        System.out.println("Phone: " + user.phone);
    }

}
