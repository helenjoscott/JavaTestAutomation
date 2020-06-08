package chapter6;

class CalculatePhoneBillTest {
    // given
    void shouldCalculateWhenIDisKnown() {
        System.out.println("Constructor with known ID");
        PhoneBillCalculator iDKnown = new PhoneBillCalculator(1.0);
        iDKnown.calculate();
    }
    // when

    // then

}