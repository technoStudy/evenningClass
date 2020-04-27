package day26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task4 {

    /*
    Junior Tester : 50_000
    QA Automation Engineer : 90K
    Senior Software Developer: 300K

    Total compensation:
    Junior Tester : 50_000 =>
            base salary: 40.000
            sign-in bonus: 2000
            RSU, restricted stock units: 8000

    */
    // create a java program which stores data above;

    // 1. way Map<String, ArrayList<Double>>: map of position and salary values
    // key: Junior Tester
    // value : {40.000, 2000, 8000}
    public static HashMap<String, List<Integer>> getPositionSalaries() {
        HashMap<String, List<Integer>> positionSalaries = new HashMap<>();

        String position = "Junior Tester";
        List<Integer> salary = Arrays.asList(40000, 2000, 8000);
        positionSalaries.put(position, salary);

        position = "SDET";
        salary = Arrays.asList(150_000, 10_000, 50_000);
        positionSalaries.put(position, salary);

        position = "CEO";
        salary = Arrays.asList(500_000, 0, 100_000);
        positionSalaries.put(position, salary);

        return positionSalaries;
    }


    // 2. way Map<String, Map<String, Double>>
    // key: Junior Tester
    // value: {
    //        base salary: 40.000
    //        sign-in bonus: 2000
    //        RSU, restricted stock units: 8000
    //    }
    public static HashMap<String, HashMap<String, Integer>> getPositionSalaries2() {
        HashMap<String, HashMap<String, Integer>> result = new HashMap<>();

        String position = "Junior Tester";
        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("base salary", 40000);
        salary.put("sign-in bonus", 2000);
        salary.put("stock units", 8000);
        result.put(position, salary);

        return result;
    }


}
