package day36.tasks.task2;

import java.util.Scanner;

//2. create class Registration, use Scanner to create users
public class Registration {

    public void register() {
        System.out.println("Provide name to register:");

        Scanner scanner = new Scanner(System.in);

        //3. add as many users as you want until
        // you enter word "exit"(Hint: loop, arrayList)
        String text = scanner.nextLine();
        User user = new User(text);
        System.out.println(user);
    }
}
