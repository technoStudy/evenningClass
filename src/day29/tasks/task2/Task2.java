package day29.tasks.task2;

public class Task2 {

    public static void main(String[] args) {
        Login login1 = Login.create("",null);
        login1.checkAndPrint();

        Login login2 = Login.create("rainwater","!2394$&*");
    }
}
