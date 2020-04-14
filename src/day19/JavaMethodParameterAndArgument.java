package day19;

public class JavaMethodParameterAndArgument {

    public static void main(String[] args) {
        String name = "Jon";
        String surname = "Snow";
        printFullName(name, surname);
    }

    public static void printFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

//    printFullName(String firstName, String lastName) variables in method are parameters
//    printFullName("Jon", "Snow"); values passing to method are arguments

}
