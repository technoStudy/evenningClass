package day43.extendsKeyword;

public class HR {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Yusuf";
        employee1.salary = 90_000;
        employee1.coef = 2;
        double tc1 = employee1.calculateTC();

        System.out.println("Name: " + employee1.name);
        System.out.println("TC: " + tc1);


        SDET employee2 = new SDET();
        employee2.name = "Fetih";
        employee2.salary = 100_000;
        employee2.coef = 1;
        employee2.bonus = 50_000;
        double tc2 = employee2.calculateTC();
        System.out.println("Name: " + employee2.name);
        System.out.println("TC: " + tc2);


    }

}
