package chapter2;

import java.util.Scanner;

public class AdjectiveSeasonCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of the year");
        String seasonOfYear = scanner.next();

        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        System.out.println("Enter a number");
        Integer cupsOfTea = scanner.nextInt();

        System.out.print("On a "+ adjective+" day in "+seasonOfYear+ " I drink "+cupsOfTea +" cups of tea");

        scanner.close();
    }
}
