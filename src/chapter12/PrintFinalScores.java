package chapter12;

import java.util.Iterator;
import java.util.Map;

public class PrintFinalScores {

    private Integer valOriginalGrade;
    private Integer valMakeupGrade;

    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeupGrades = TestResults.getMakeUpGrades();

        Iterator<String> originalIterator = originalGrades.keySet().iterator();

        while (originalIterator.hasNext()) {
            String key = originalIterator.next();
            Integer originalValue = originalGrades.get(key);
            Integer makeUpValue = makeupGrades.get(key);

            if (originalValue < makeUpValue) {
                // put new value in the originalGrade hashmap
                originalGrades.put(key, makeUpValue);
            }
        }
        System.out.println("New values in the original Hashmap are: " + originalGrades);
    }
}
