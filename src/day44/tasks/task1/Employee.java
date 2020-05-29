package day44.tasks.task1;

public class Employee extends Person {
    private School school;
    private double salary;

    public Employee(String name, String address, School school, double salary) {
        setName(name);
        setAddress(address);
        setSchool(school);
        setSalary(salary);
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n\nEmployee" +
                super.toString() +
                "\nschool: " + getSchool().getName() +
                "\nsalary: " + getSalary();
    }
}
