package day47.tasks.task2;

public abstract class Employee {
    private String name;
    private double baseSalary;


    public abstract double calculateSalary();

    public final double bonus() {
        return 0.1;//10% bonus
    }


    public double getBaseSalary() {
        return baseSalary;
    }
}
