package chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChooseDayOfWeek {


    public static void main(String[] args) {
        askUserForDay();
    }

    public static void askUserForDay() {
        DayOfTheWeek newDayOfTheWeek = new DayOfTheWeek();
        Scanner scanner = new Scanner(System.in);

        try {
            // check it really is a number first
            System.out.println("Please enter a number between 1 and 7");
            int userInput = scanner.nextInt();

            // We know it's a valid int, now check it's in range
            if ((userInput < 1) || (userInput > 7)) {
                System.out.println(userInput + " needs to be between 1 and 7. Please try again.");
                askUserForDay();
            } else {
                // valid number in range passed in so print the result
                System.out.println(newDayOfTheWeek.getDayOfWeek(userInput));
            }

        } catch (InputMismatchException e) {
            // user didn't pass in a number, handle it
            System.out.println("That wasn't a valid number. Don't worry, I caught the resulting " + e + " - you're welcome. Please try again");
            // clear the scanner buffer becase apparently it likes to remember and try again
            scanner.nextLine();
            askUserForDay();
        }
    }
}

