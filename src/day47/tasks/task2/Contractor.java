package day47.tasks.task2;

public class Contractor extends Employee {

    public Contractor(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBaseSalary() * bonus();
    }
}
