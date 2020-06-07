package chapter5;

import java.util.Scanner;

public class PhoneBill {

    //Initialise what we know
    static double overagePerMinuteCost = 0.25;
    int tax = 15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userFee = getFee();
        int useOverageMinutes = getOverageMinutes();
        double totalOverageCost = calculateOverageFee(useOverageMinutes);
        double overageCost = calculateTotalAndTax(totalOverageCost, userFee);
        tellUser(overageCost);
    }

    public static int getFee(){
        System.out.println("What is your planFee?");
        return scanner.nextInt();
    }

    public static int getOverageMinutes(){
        System.out.println("How many overage minutes do you have?");
        return scanner.nextInt();
    }

    public static double calculateOverageFee(int min){
        return min*overagePerMinuteCost;
    }

    public static double calculateTotalAndTax(double totalOveragecost, int userFee){
        double preTaxBill = totalOveragecost+userFee;
        double taxAdded = (preTaxBill/100)*15;
        return taxAdded+preTaxBill;
    }

    public static void tellUser(double amountOwed){
        System.out.println("You owe " +amountOwed);
    }
}
