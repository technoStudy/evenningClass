package day20;

public class Task4 {
    //create method that calculates average of given student result
    // inputs: name and results
    // ex: Ali, 30, 40, 90, 100
    /// Ali : 65
    // ex: Bali, 30, 40, 90, 100, 95, 86
    /// Bali : 73.5


    public static void studentAverage(String name, double... results) {
        double totalPoints = 0;

        for(double subjectResult : results) {
            totalPoints += subjectResult;
        }

        double averageResult = totalPoints / results.length;

        System.out.println(name + ": " + averageResult);
    }

    public static void main(String[] args) {
        studentAverage("Ali", 30, 40, 90, 100);
        studentAverage("Bali", 30, 40, 90, 100, 95, 86);
    }


}
