//Decided to separate it to make it organized.

public class RiverGame {
    //game variables
    int leftMissionaries = 3;
    int leftCannibals = 3;
    int rightMissionaries = 0;
    int rightCannibals = 0;

    // true = left bank, false = right bank
    boolean boatOnLeft = true;

    //Variable if a game is ongoing currently, really different from playAgain.
    boolean isPlaying = true;

    //Win or Lose Condition
    boolean Win = true; // (Currently unused, but fine to keep)

    public void printCurrentState() {
        System.out.println("\n--- Current State ---");
        System.out.println("Left Bank: " + leftMissionaries + " Missionaries || " + leftCannibals + " Cannibals");
        System.out.println("Right Bank: " + rightMissionaries + " Missionaries || " + rightCannibals + " Cannibals");
        System.out.println("Boat is on the: " + (boatOnLeft ? "Left Bank" : "Right Bank"));
        System.out.println("---------------------");
    }

    public void processMove(int moveM, int moveC) {
        //Checker to see whether the boat is overloaded
        if (moveM + moveC < 1 || moveM + moveC > 2) {
            System.out.println("Invalid! Boat can only contain up to 2 passengers, and no less than 1");
            return; // Exits the method early instead of using continue
        }

        //Move Passengers logic
        if (boatOnLeft) {
            //Checker to make sure they have enough people on the left bank
            if (moveM > leftMissionaries || moveC > leftCannibals) {
                System.out.println("Invalid! Not enough people to move from the left");
                return;
            }
            //Subtracts from the left
            leftMissionaries = leftMissionaries - moveM;
            leftCannibals = leftCannibals - moveC;

            //Adds to the right (FIXED VARIABLE NAMES HERE)
            rightMissionaries = rightMissionaries + moveM;
            rightCannibals = rightCannibals + moveC;
            boatOnLeft = false; //Boat moves to the right
        } else {
            //Checker to make sure they have enough people on the right bank
            if (moveM > rightMissionaries || moveC > rightCannibals) {
                System.out.println("Invalid! Not enough people on the Right Bank.");
                return;
            }
            //Subtracts from right
            rightMissionaries = rightMissionaries - moveM;
            rightCannibals = rightCannibals - moveC;

            //Adds to the left (FIXED VARIABLE NAMES HERE)
            leftMissionaries = leftMissionaries + moveM;
            leftCannibals = leftCannibals + moveC;
            boatOnLeft = true; //Boat moves to the left
        } // <--- Movement if/else block ends HERE!

        //Check for Win/Loss (Now correctly evaluates every turn)
        //Win Condition: Everyone made it to the right bank
        if (rightMissionaries == 3 && rightCannibals == 3) {
            System.out.println("\nYOU WIN!");
            System.out.println("All Missionaries and Cannibals safely crossed the river");
            System.out.println("\n--- FINAL STATE ---");
            System.out.println("Left Bank: " + leftMissionaries + " M || " + leftCannibals + " C");
            System.out.println("Right Bank: " + rightMissionaries + " M || " + rightCannibals + " C");
            isPlaying = false;

            //Lose Condition: Cannibals outnumber Missionaries
        } else if ((leftCannibals > leftMissionaries && leftMissionaries > 0) ||
                (rightCannibals > rightMissionaries && rightMissionaries > 0)) {
            System.out.println("\nYOU LOST!");
            System.out.println("The Cannibals outnumbered the Missionaries...");
            System.out.println("\n--- FINAL STATE ---");
            System.out.println("Left Bank: " + leftMissionaries + " M || " + leftCannibals + " C");
            System.out.println("Right Bank: " + rightMissionaries + " M || " + rightCannibals + " C");
            isPlaying = false;
        }
    }
}