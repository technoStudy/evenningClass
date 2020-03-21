package day4;

public class Task4 {
    // create two variables, with data type: String & double
    // print them in single println

//    part 2
//    try to get output like below
//    What is you weight?
//    My weight is: 67.5

    public static void main(String[] args) {
//        String njTax = "NJ tax rate is";
//        double tax = 6.625;
//
//        String output = njTax + " " + tax + "%";
//        System.out.println( output );
        ///////////////// "NJ tax rate is" + " " + 6.625
        ///////////////// "NJ tax rate is " + 6.625
        ///////////////// "NJ tax rate is 6.625"

        System.out.println( "Part 2" );
        double weight = 89.88;
        String unit = "lbs";

        System.out.println( "What is you weight?" );
        System.out.println( "My weight is: " + weight + unit );

    }
}
