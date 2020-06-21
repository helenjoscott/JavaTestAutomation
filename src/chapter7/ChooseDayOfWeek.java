package chapter7;

import java.util.Scanner;

public class ChooseDayOfWeek {
    public static void main(String[] args) {
        DayOfTheWeek newDayOfTheWeek = new DayOfTheWeek();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number betweeen 1 and 7 for the day of the week");

        System.out.println(newDayOfTheWeek.getDayOfWeek(scanner.nextInt()));
    }
}
