package day43.extendsKeyword;

public class SDET extends Employee {
    public double bonus;
    public boolean remoteWork;

    @Override
    public double calculateTC() {
        return salary * coef + bonus;
    }


    //cannot override method that doesn't present in parent class
//    @Override
//    public void print(){
//
//    }
}
