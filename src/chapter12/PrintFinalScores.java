package chapter12;

import java.util.Iterator;
import java.util.Map;

public class PrintFinalScores {

    private Integer valOriginalGrade;
    private Integer valMakeupGrade;

    public static void main(String[] args) {
        System.out.println("Here are the student's final test scores");
        Map originalGrades = TestResults.getOriginalGrades();
        Map makeupGrades = TestResults.getMakeUpGrades();

        Iterator originalIterator = originalGrades.keySet().iterator();
        Iterator makeupIterator = makeupGrades.keySet().iterator();

        while (originalIterator.hasNext()) {
            Object key = originalIterator.next();
            Integer originalValue = (Integer) originalGrades.get(key);
            Integer makeUpValue = (Integer) makeupGrades.get(key);

            if (originalValue > makeUpValue) {
                System.out.println(key +" 's score is " + originalValue);
            } else
                // put new value in the originalGrade hashmap
                originalGrades.put(key,makeUpValue);
                System.out.println(key +" 's score is " + makeUpValue);
        }
        System.out.println("New values in the original Hashmap are: " + originalGrades);
    }
}
