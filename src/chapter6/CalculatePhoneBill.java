package chapter6;

public class CalculatePhoneBill {
    public static void main(String[] args) {

        //Nothing known
        System.out.println("Default constructor, nothing known");
        PhoneBill nothingKnown = new PhoneBill();
        nothingKnown.calculateWhenNothingKnown();

        //ID known
        System.out.println("Constructor with known ID");
        PhoneBill iDKnown = new PhoneBill(1.0);
        iDKnown.calculateWhenIDKnown();

        //Everything known
        System.out.println("Constructor with everything known");
        PhoneBill everythingKnown = new PhoneBill(1.0, 5.0, 5.0, 6.0);
        everythingKnown.caculateWhenEverythingKnown();
    }
}
