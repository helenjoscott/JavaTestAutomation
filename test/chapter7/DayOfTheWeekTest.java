package chapter7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class DayOfTheWeekTest {

    // is it a valid int from the user
    @Test
    void checkValidInput() {
        // given a new instance
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();

        // create a random number between 0 and 6, is this the best way?
        int random = new Random().nextInt(6);

        //int random = (0 + (int)(Math.random() * ((7 - 0) + 1)));

        // need to add the +1 back on as I subtracted it to align 0
        // with Monday as most users would expect to enter 1 for Monday
        String dayReturned = dayOfTheWeek.getDayOfWeek(random + 1);
        switch (random) {
            case 0 -> Assertions.assertEquals("Monday", dayReturned);
            case 1 -> Assertions.assertEquals("Tuesday", dayReturned);
            case 2 -> Assertions.assertEquals("Wednesday", dayReturned);
            case 3 -> Assertions.assertEquals("Thursday", dayReturned);
            case 4 -> Assertions.assertEquals("Friday", dayReturned);
            case 5 -> Assertions.assertEquals("Saturday", dayReturned);
            case 6 -> Assertions.assertEquals("Sunday", dayReturned);
        }
    }
}
