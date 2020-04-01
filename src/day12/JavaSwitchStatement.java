package day12;

import java.util.Scanner;

public class JavaSwitchStatement {
    /*
            'A'-> Excellent!!!
            'B'-> Well done
            'C'-> Good
            'D'-> Need improvement
            'F'-> Fail
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
        String examResult = scan.nextLine();
        String examMark = "";

        switch(examResult) {
            case "A":
                examMark = "Excellent!!!";
                break;
            case "B":
                examMark = "Well done";
                break;
            case "C":
                examMark = "Good";
                break;
            case "D":
                examMark = "Need improvement";
                break;
            case "F":
                examMark = "Fail";
                break;
            default:
                examMark = "Not a valid input";
                break;
        }

        System.out.println( examMark );

    }

}
