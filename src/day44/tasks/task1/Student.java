package day44.tasks.task1;

public class Student extends Person {
    private School school;
    private double fee;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    @Override
    public String toString() {
        return "\n\nStudent" +
                super.toString() +
                "\nfee: " + getFee();
    }

}
