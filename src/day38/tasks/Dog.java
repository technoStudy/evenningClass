package day38.tasks;

public class Dog {
    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch(NullPointerException e) {
            System.out.print("4");
        } catch(NumberFormatException e2){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Dog leroy = new Dog();
        leroy.name = "Leroy";
        leroy.parseName();
        System.out.print("5");
    }
}