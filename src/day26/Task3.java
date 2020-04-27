package day26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task3 {
    // TC = Total Compensation
    // base salary
    // sign-in bonus
    // stock units

    // position | base salary | sign-in bonus | stock units | TC
    // Manager  | 100_000     | 5000          | 50_000      | 155_000
    // SDET     | 150_000     | 10_000        | 50_000      | 210_000
    // CEO      | 500_000     | 0             | 100_000     | 600_000

    // create method that return Map of Position and salary
    public static HashMap<String, List<Integer>> getPositionSalaries() {
        HashMap<String, List<Integer>> positionSalaries = new HashMap<>();

        String position = "Manager";
        List<Integer> salary = Arrays.asList(100_000, 5000, 50_000);
        positionSalaries.put(position, salary);

        position = "SDET";
        salary = Arrays.asList(150_000, 10_000, 50_000);
        positionSalaries.put(position, salary);

        position = "CEO";
        salary = Arrays.asList(500_000, 0, 100_000);
        positionSalaries.put(position, salary);

        return positionSalaries;
    }

    public static HashMap<String, HashMap<String, Integer>> getPositionSalaries2() {
        HashMap<String, HashMap<String, Integer>> result = new HashMap<>();

        String position = "Manager";
        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("base salary", 100_000);
        salary.put("sign-in bonus", 5000);
        salary.put("stock units", 50_000);
        result.put(position, salary);

        return result;
    }


    // create method that calculates total compensation of positions
}
