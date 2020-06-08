package chapter6;

public class CalculatePhoneBill {
    public static void main(String[] args) {

        //create a new instance of this class
        CalculatePhoneBill calcPhoneBill = new CalculatePhoneBill();

        //create a new instance of my other class and call the calculate method
        PhoneBill pb1 = new PhoneBill(1, 5, 5, 6);
        double pb1PhoneBill = pb1.calculatePhoneBill();
        System.out.println("Your pb1 phone bill was " + pb1PhoneBill);

        PhoneBill pb2 = new PhoneBill(1);
        pb2.getBaseCost();
        pb2.getAllocatedMinutes();
        pb2.getMinutesUsed();
        double pb2PhoneBill = pb2.calculatePhoneBill();
        System.out.println("Your pb2 phone bill was " + pb2PhoneBill);

        PhoneBill pb3 = new PhoneBill();
        pb3.getIdNumber();
        pb3.getBaseCost();
        pb3.getAllocatedMinutes();
        pb3.getMinutesUsed();
        double pb3PhoneBill = pb3.calculatePhoneBill();
        System.out.println("Your pb3 phone bill was " + pb3PhoneBill);

    }


}
