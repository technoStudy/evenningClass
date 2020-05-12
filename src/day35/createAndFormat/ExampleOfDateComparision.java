package day35.createAndFormat;

import java.time.LocalDate;
import java.time.Month;

public class ExampleOfDateComparision {
    public static void main(String[] args) {
        LocalDate registrationDate = LocalDate.of(2020, Month.SEPTEMBER, 1);
        LocalDate currentDate = LocalDate.now();//LocalDate.of(3000, 1,1);

        if(currentDate.isBefore(registrationDate)) {
            System.out.println("You have time to register");
        } else {
            System.out.println("Registration date is over, please contact administration for further information.");
        }
    }
}
