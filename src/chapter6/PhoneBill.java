package chapter6;

import java.util.Scanner;

public class PhoneBill {

    private int id;
    private double baseCost;
    private double allocatedMinutes;
    private double minutesUsed;
    private double totalBill;

    static double OVERAGE_PER_MIN_COST = 0.25;
    static double OVERAGE_TAX = 0.15;

    Scanner scanner = new Scanner(System.in);

    public PhoneBill() {
    }

    public PhoneBill(int id) {
        this.id=id;
    }

    public PhoneBill(int id, int baseCost, int allocatedMinutes, int minutesUsed) {
        this.id=id;
        this.baseCost=baseCost;
        this.allocatedMinutes=allocatedMinutes;
        this.minutesUsed=minutesUsed;
    }

    public double calculatePhoneBill() {
        var amountOver = Math.abs((allocatedMinutes - minutesUsed) * OVERAGE_TAX);
        return baseCost + amountOver;

        // System.out.println("You spent an extra "+ amountOver + " in tax, due to being " + Math.abs(allocatedMinutes-minutesUsed) +" minutes over your allowance of " + allocatedMinutes + " minutes");

    }

    public void getIdNumber() {
        System.out.println("What is your id of your phone bill?");
        this.id = scanner.nextInt();
    }

    public void getBaseCost() {
        System.out.println("What is the base cost of your phone bill?");
        this.baseCost = scanner.nextInt();
    }

    public void getAllocatedMinutes() {
        System.out.println("What is your number of allocated minutes?");
        this.allocatedMinutes = scanner.nextInt();
    }

    public void getMinutesUsed() {
        System.out.println("How many minutes did you use");
        this.minutesUsed = scanner.nextInt();
    }
}

