package chapter6;


import org.junit.jupiter.api.Test;

class PhoneBillTestKnowEverything {
    @Test
    void givenSpecificParameters() {
        // given
        PhoneBillCalculator everythingKnown = new PhoneBillCalculator(1.0, 5.0, 5.0, 6.0);
        // when
        everythingKnown.calculate();
        // then
        // how do I get to the variables?

    }
}