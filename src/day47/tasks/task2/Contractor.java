package day47.tasks.task2;

public class Contractor extends Employee {

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBaseSalary() * bonus();
    }
}
