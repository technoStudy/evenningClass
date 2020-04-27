package day27;

public class Person {
    //attributes/fields/instance variable
    long id;
    String name;
    int age;

    public static void main(String[] args) {
//        Scanner scan= new Scanner (System.in);
//        Random random = new Random();

        Person person1 = new Person();
        person1.id = 1010;
        person1.name = "Yusuf";
        person1.age = 24;

        System.out.println("ID: " + person1.id);
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);

    }

}
