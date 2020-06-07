package chapter6;

import java.util.Scanner;

public class PhoneBill {

    int id;
    double baseCost;
    double allocatedMinutes;
    double minutesUsed;
    double totalBill;

    static double overagePerMinuteCost = 0.25;
    static double tax = 0.15;

    Scanner scanner = new Scanner(System.in);

    protected void getIdNumber (){
        System.out.println("What is your id of your phone bill?");
        this.id = scanner.nextInt();
    }

    protected void getBaseCost(){
        System.out.println("What is the base cost of your phone bill?");
        this.baseCost = scanner.nextInt();
    }

    protected void getAllocatedMinutes(){
        System.out.println("What is your number of allocated minutes?");
        this.allocatedMinutes = scanner.nextInt();
    }

    protected void getMinutesUsed(){
        System.out.println("How many minutes did you use");
        this.minutesUsed = scanner.nextInt();
    }



    public PhoneBill (){
        //this constructor needs to find out everything
        getIdNumber();
        getBaseCost();
        getAllocatedMinutes();
        getMinutesUsed();

        //calculate total bill
        totalBill = calculatePhoneBill();
       // System.out.println("Total bill is "+totalBill);
    }

    public PhoneBill (int id){
        //this constructor knows the id but needs to find everything else out
        getBaseCost();
        getAllocatedMinutes();
        getMinutesUsed();

        //calculate total bill
        totalBill = calculatePhoneBill();
        //System.out.println("Total bill is "+totalBill);

    }

    public PhoneBill (int id, int baseCost, int allocatedMinutes, int minutesUsed) {
        //this constructor is given everything so just needs to calculate

        //calculate total bill
        totalBill = calculatePhoneBill();
        System.out.println("Total bill is "+totalBill);

    }

    public double calculatePhoneBill(){
        var amountOver = Math.abs((allocatedMinutes-minutesUsed)*tax);
           // System.out.println("You spent an extra "+ amountOver + " in tax, due to being " + Math.abs(allocatedMinutes-minutesUsed) +" minutes over your allowance of " + allocatedMinutes + " minutes");
            return baseCost+amountOver;
        }
    }

