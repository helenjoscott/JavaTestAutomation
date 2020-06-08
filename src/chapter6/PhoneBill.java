package chapter6;

public class PhoneBill {
    public static void main(String[] args) {

        //Nothing known
        System.out.println("Default constructor, nothing known");
        PhoneBillCalculator nothingKnown = new PhoneBillCalculator();
        nothingKnown.calculate();

        //ID known
        System.out.println("Constructor with known ID");
        PhoneBillCalculator iDKnown = new PhoneBillCalculator(1.0);
        iDKnown.calculate();

        //Everything known
        System.out.println("Constructor with everything known");
        PhoneBillCalculator everythingKnown = new PhoneBillCalculator(1.0, 5.0, 5.0, 6.0);
        everythingKnown.calculate();
    }
}
