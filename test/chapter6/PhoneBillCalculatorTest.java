package chapter6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBillCalculatorTest {
    @Test
    void givenSpecificParameters() {
        // given
        PhoneBillCalculator everythingKnown = new PhoneBillCalculator(1.0, 5.0, 5.0, 6.0);

        // when
        everythingKnown.calculate();

        // then
        double finalBill = everythingKnown.getFinalBill();
        Assertions.assertEquals(5.15, finalBill);

        double minOver = everythingKnown.getMinOver();
        Assertions.assertEquals(1.0, minOver);

        double taxCostOnMinOver = everythingKnown.getTaxCostOnMinOver();
        Assertions.assertEquals(0.15, taxCostOnMinOver);
        // add the other two variables for this constructor and test for invalid values
    }
}