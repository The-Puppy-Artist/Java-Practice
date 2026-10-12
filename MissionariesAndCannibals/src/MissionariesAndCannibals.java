package com.iacademy.cselect1.midterms;

import java.util.Scanner;

public class MissionariesAndCannibals {

    Scanner input = new Scanner(System.in);

    int leftMissionaries = 3;
    int leftCannibals = 3;
    int rightMissionaries = 0;
    int rightCannibals = 0;

    // true = left bank, false = right bank
    boolean boatOnLeft = true;

    public void main(String[] args) {
        boolean playAgain;
        do {
            resetGame();

            // Inner game loop runs as long as processTurn() returns true
            do {
                printCurrentState();
            } while (processMove());

            System.out.print("\nPlay again? (Y/N): ");
            switch (input.next()) {
                case "y":
                case "yes":
                case "Y":
                case "Yes":
                    playAgain = true;
                    break;
                default:
                    playAgain = false;
                    break;
            }
        } while (playAgain);

        System.out.println("Thank you for playing!");
        input.close();
    }

    public void resetGame() {
        leftMissionaries = 3;
        leftCannibals = 3;
        rightMissionaries = 0;
        rightCannibals = 0;
        boatOnLeft = true;
    }

    public void printCurrentState() {
        System.out.println("\n--- Current State ---");
        System.out.println("Left Bank: " + leftMissionaries + " Missionaries || " + leftCannibals + " Cannibals");
        System.out.println("Right Bank: " + rightMissionaries + " Missionaries || " + rightCannibals + " Cannibals");
        System.out.println("Boat is on the: " + (boatOnLeft ? "Left Bank" : "Right Bank"));
        System.out.println("---------------------");
    }

    public boolean processMove() {
        System.out.print("Missionaries to move: ");
        int moveM = input.nextInt();

        System.out.print("Cannibals to move: ");
        int moveC = input.nextInt();

        if (moveM + moveC < 1 || moveM + moveC > 2) {
            System.out.println("Invalid! Boat can only contain up to 2 passengers, and no less than 1");
            return true;
        }
        if (boatOnLeft) {
            if (moveM > leftMissionaries || moveC > leftCannibals) {
                System.out.println("Invalid! Not enough people to move from the left");
                return true;
            }
            leftMissionaries -= moveM;
            leftCannibals -= moveC;
            rightMissionaries += moveM;
            rightCannibals += moveC;
            boatOnLeft = false;
        } else {
            if (moveM > rightMissionaries || moveC > rightCannibals) {
                System.out.println("Invalid! Not enough people on the Right Bank.");
                return true;
            }
            rightMissionaries -= moveM;
            rightCannibals -= moveC;
            leftMissionaries += moveM;
            leftCannibals += moveC;
            boatOnLeft = true;
        }
        if (rightMissionaries == 3 && rightCannibals == 3) {
            System.out.println("\nYOU WIN!");
            System.out.println("All Missionaries and Cannibals safely crossed the river");
            printFinalState();
            return false; // Stop inner loop
        }
        // Check Loss Condition
        else if ((leftCannibals > leftMissionaries && leftMissionaries > 0) ||
                (rightCannibals > rightMissionaries && rightMissionaries > 0)) {
            System.out.println("\nYOU LOST!");
            System.out.println("The Cannibals outnumbered the Missionaries...");
            printFinalState();
            return false; // Stop inner loop
        }

        return true; // Game continues
    }

    public void printFinalState() {
        System.out.println("\n--- FINAL STATE ---");
        System.out.println("Left Bank: " + leftMissionaries + " M || " + leftCannibals + " C");
        System.out.println("Right Bank: " + rightMissionaries + " M || " + rightCannibals + " C");
    }
}
