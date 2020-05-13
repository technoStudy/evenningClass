package day36.tasks.task2;

import java.util.ArrayList;
import java.util.Scanner;

//2. create class Registration, use Scanner to create users
public class Registration {

    public ArrayList<User> register() {
        ArrayList<User> userList = new ArrayList<>();
        System.out.println("Provide name to register:");

        Scanner scanner = new Scanner(System.in);

        //3. add as many users as you want until
        // you enter word "exit"(Hint: loop, arrayList)
        String text = scanner.nextLine();
        while(!text.equalsIgnoreCase("exit")) {
            User user = new User(text);
            userList.add(user);

            text = scanner.nextLine();
        }

        return userList;
    }
}
