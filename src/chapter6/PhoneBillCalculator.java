package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator {

    private String name;
    private Double id;
    private Double baseCost;
    private Double allocatedMinutes;
    private Double minutesUsed;

    private double minOver;
    private double taxCostOnMinOver;
    private double finalBill;

    static double OVERAGE_TAX = 0.15;

    Scanner scanner = new Scanner(System.in);

    public PhoneBillCalculator() {
    }

    public PhoneBillCalculator(Double id) {
        this.id = id;
    }

    public PhoneBillCalculator(Double id, Double baseCost, Double allocatedMinutes, Double minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allocatedMinutes = allocatedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public void calculate() {
        findOutName();
        if (id == null) {
            System.out.println(name + ", what is the ID of your phone bill?");
            this.id = scanner.nextDouble();
        }
        if (baseCost == null) {
            System.out.println(name + ", what is the base cost of your phone bill?");
            this.baseCost = scanner.nextDouble();

            System.out.println(name + ", What is your number of allocated minutes?");
            this.allocatedMinutes = scanner.nextDouble();

            System.out.println(name + ", How many minutes did you use");
            this.minutesUsed = scanner.nextDouble();
        }
        notifyUser();
    }

    private void findOutName() {
        System.out.println("What is your name?");
        name = scanner.next();
    }

    private void notifyUser() {
        // bill calculations
        minOver = minutesUsed - allocatedMinutes;
        taxCostOnMinOver = minOver * OVERAGE_TAX;
        finalBill = baseCost + taxCostOnMinOver;

        if (minutesUsed > allocatedMinutes) {
            System.out.println(name + ", you used extra " + minOver + " minutes, which is " + taxCostOnMinOver + " in tax. Your final bill is " + finalBill + ".");
        } else
            System.out.println(name + ", you were inside your minutes allowance. Your final bill is " + baseCost + ".");
    }
}
