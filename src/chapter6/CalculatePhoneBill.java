package chapter6;

public class CalculatePhoneBill {
    public static void main(String[] args) {

        //Nothing known
        System.out.println("Default constructor, nothing known");
        PhoneBill nothingKnown = new PhoneBill();
        nothingKnown.calculate();

        //ID known
        System.out.println("Constructor with known ID");
        PhoneBill iDKnown = new PhoneBill(1.0);
        iDKnown.calculate();

        //Everything known
        System.out.println("Constructor with everything known");
        PhoneBill everythingKnown = new PhoneBill(1.0, 5.0, 5.0, 6.0);
        everythingKnown.calculate();
    }
}
