package day43.extendsKeyword;

public class Employee {
    public String name;
    public double salary;
    public double coef; //performance of employee
    //default coef = 1
    //performs well coef > 1
    //performs bad coef < 1

    public double calculateTC() {
        return salary * coef;
    }
}
