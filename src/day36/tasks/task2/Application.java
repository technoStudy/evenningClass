package day36.tasks.task2;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Registration examRegistration = new Registration();
        ArrayList<User> users = examRegistration.register();

        for(User user : users) {
            System.out.println(user);
        }

    }
}
