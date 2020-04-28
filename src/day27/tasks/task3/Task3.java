package day27.tasks.task3;

public class Task3 {

    public static void main(String[] args) {
        Profile profile1 = new Profile();
        profile1.firstName = "Brann";
        profile1.lastName = "Stark";
        profile1.birthDate = "04/12/1005";
        profile1.address = "Wind St";
        profile1.email = "broken@shores";
        profile1.phone = "+1 555 44 66";
        profile1.middleName = "Middle Name";
        profile1.nickname = "Nickname";
        User user1 = createUser("thebroken", "winterfell", profile1);
        printUser(user1);

    }

    public static User createUser(String username, String password, Profile profile) {
        User user1 = new User();
        user1.username = username;
        user1.password = password;

        user1.profile = profile;
        return user1;
    }

    public static void printUser(User user) {
        System.out.println("Username: " + user.username);
        System.out.println("Password: " + user.password);

        System.out.println("FirstName: " + user.profile.firstName);
        System.out.println("LastName: " + user.profile.lastName);
        System.out.println("Birth Date: " + user.profile.birthDate);
        System.out.println("Address: " + user.profile.address);
        System.out.println("Email: " + user.profile.email);
        System.out.println("Phone: " + user.profile.phone);

        System.out.println("Middle Name: " + user.profile.middleName);
        System.out.println("Nickname: " + user.profile.nickname);
    }

}
