package chapter12;

import java.util.Map;

public class PrintFinalScores {

    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeupGrades = TestResults.getMakeUpGrades();

        originalGrades.forEach((key, originalValue) -> {
            Integer makeUpValue = makeupGrades.get(key);

            if (originalValue < makeUpValue) {
                // put new value in the originalGrade hashmap
                originalGrades.put(key, makeUpValue);
            }
        });
        System.out.println("New values in the original Hashmap are: " + originalGrades);
    }
}
