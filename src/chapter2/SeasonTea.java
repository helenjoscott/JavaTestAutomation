package chapter2;

import java.util.Scanner;

public class SeasonTea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String seasonOfYear = getString(scanner);

        System.out.println("Enter a number");
        int cupsOfTea = scanner.nextInt();

        System.out.print("In " + seasonOfYear + " I drink " + cupsOfTea + " cups of tea");

        scanner.close();

    }

    public static String getString(Scanner scanner) {
        System.out.println("Enter a season");
        return scanner.next();
    }
}