package chapter2;

import java.util.Scanner;

public class SeasonTea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season");
        String seasonOfYear = scanner.next();

        System.out.println("Enter a number");
        int cupsOfTea = scanner.nextInt();

        System.out.print("In " + seasonOfYear + " I drink " + cupsOfTea + " cups of tea");

        scanner.close();

    }
}