package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        int numOfSpaces = 20;
        int maxAllowedDieRolls = 5;
        int totalSpacesMoved = 0;

        //Loop for max number of dice rolls
        for (int i=1; i<=maxAllowedDieRolls; i++) {

            //Roll the die for the user and store the result. Dice have size sides
            Random randomDieRoll = new Random();
            int dieRoll = randomDieRoll.nextInt(6) + 1;
            totalSpacesMoved = totalSpacesMoved + dieRoll;

            System.out.println("The user dice roll was: " + dieRoll + " and the total number of spaces now moved is " + totalSpacesMoved);

            //decrease the number of spaces left on the board by the dice number rolled
            numOfSpaces = numOfSpaces - dieRoll;

            //decrease the number of allowed dice rolls by one
            // System.out.println("You have " + (maxAllowedDieRolls-i) + " dice rolls left.");

            //winning
            if (totalSpacesMoved == 20) {
                System.out.println("You WON the game, nice job!");
                break;
            }
            //over the total number of spaces
            else if (totalSpacesMoved > 20) {
                System.out.println("You went over the allowed number of spaces, you LOST!");
                break;
            }

            //ran out of goes in the game
            if ((maxAllowedDieRolls - i) == 0) {
                System.out.println("You ran out of goes, you LOST!");

            }

        }
    }
}
