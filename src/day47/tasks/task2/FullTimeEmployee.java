package day47.tasks.task2;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 2000;
    }
}
