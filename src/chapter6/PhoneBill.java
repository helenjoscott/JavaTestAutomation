package chapter6;

import java.util.Scanner;

public class PhoneBill {

    private String name;
    private Double id;
    private Double baseCost;
    private Double allocatedMinutes;
    private Double minutesUsed;

    static double OVERAGE_TAX = 0.15;

    Scanner scanner = new Scanner(System.in);

    public PhoneBill() {
        this.name = name;
    }

    public PhoneBill(Double id) {
        this.name = name;
        this.id = id;
    }

    public PhoneBill(Double id, Double baseCost, Double allocatedMinutes, Double minutesUsed) {
        this.name = name;
        this.id = id;
        this.baseCost = baseCost;
        this.allocatedMinutes = allocatedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public void calculateWhenNothingKnown() {
        inialiseWhenNothingKnown();
        notifyUser();
    }

    public void calculateWhenIDKnown() {
        initialiseWhenIdKnown();
        notifyUser();
    }

    public void caculateWhenEverythingKnown() {
        initialiseWhenEverythingKnown();
        notifyUser();
    }


    public void inialiseWhenNothingKnown() {
        System.out.println("What is your name?");
        name = scanner.next();

        System.out.println(name + ", what is the ID of your phone bill?");
        this.id = scanner.nextDouble();

        System.out.println(name + ", what is the base cost of your phone bill?");
        this.baseCost = scanner.nextDouble();

        System.out.println(name + ", What is your number of allocated minutes?");
        this.allocatedMinutes = scanner.nextDouble();

        System.out.println(name + ", How many minutes did you use");
        this.minutesUsed = scanner.nextDouble();
    }

    public void initialiseWhenIdKnown() {
        System.out.println("What is your name?");
        name = scanner.next();

        System.out.println(name + ", what is the base cost of your phone bill?");
        this.baseCost = scanner.nextDouble();

        System.out.println(name + ", What is your number of allocated minutes?");
        this.allocatedMinutes = scanner.nextDouble();

        System.out.println(name + ", How many minutes did you use");
        this.minutesUsed = scanner.nextDouble();
    }

    public void initialiseWhenEverythingKnown() {
        System.out.println("What is your name?");
        name = scanner.next();
    }

    public void notifyUser() {
        //some local variables to help out with the sums
        double minOver = minutesUsed - allocatedMinutes;
        double taxOnMinOver = minOver * OVERAGE_TAX;

        if (minutesUsed > allocatedMinutes) {
            System.out.println(name + ", you used extra " + minOver + " minutes, which is " + taxOnMinOver + " in tax. Your final bill is " + (baseCost + taxOnMinOver) + ".");
        } else
            System.out.println(name + ", you were inside your minutes allowance. Your final bill is " + baseCost + ".");
    }
}

