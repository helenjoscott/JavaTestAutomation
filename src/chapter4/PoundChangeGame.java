package chapter4;

import java.util.Scanner;

public class PoundChangeGame {
    public static void main(String[] args) {
        int noOfPennies;
        int noOfFives;
        int noOfTens;
        int noOfTwenties;
        int noOfFifties;

        int totalChange;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of pennies you have:");
        noOfPennies = scanner.nextInt();

        System.out.println("Enter the number of 5ps you have:");
        noOfFives = scanner.nextInt() * 5;

        System.out.println("Enter the number of 10ps that you have:");
        noOfTens = scanner.nextInt() * 10;

        System.out.println("Enter the number of 20ps that you have:");
        noOfTwenties = scanner.nextInt() * 20;

        System.out.println("Enter the number of 50ps that you have:");
        noOfFifties = scanner.nextInt() * 50;
        scanner.close();

        totalChange=(noOfPennies+noOfFives+noOfTens+noOfTwenties+noOfFifties);
        System.out.println("Total change is " +totalChange);
        if (totalChange==100)
        {
            System.out.println("You win!");
        }
        else{
            System.out.print("You lose :(");
        }
    }
}
