package day31.instanceModifiers.publicModifier.same;

public class InSamePackage {

    public static void main(String[] args) {
        Student student1 = new Student("John");
        System.out.println(student1);
        student1.name = "Max";
        System.out.println(student1.toString());


    }
}
