package chapter6;

public class CalculatePhoneBill {
    public static void main(String[] args) {

        //create a new instance of this class
        CalculatePhoneBill calcPhoneBill = new CalculatePhoneBill();

        //create a new instance of my other class and call the getPhoneBill method
        PhoneBill pb1 = new PhoneBill();
        pb1.calculatePhoneBill();

        System.out.println("Your ID is "+pb1.id + ". Your base cost is " +pb1.baseCost+". Your allocated minutes was "+pb1.allocatedMinutes+". You used "+pb1.minutesUsed+" minutes. Your total bill with tax is "+pb1.totalBill);

    }

}
