import java.util.Scanner;

//Main Block that runs the whole program
public class EstradaLiz_MidtermsCJ1 {

    Scanner input = new Scanner(System.in);

    // Variables updated to Masons and Cardinals based on the PDF
    int leftMasons = 3;
    int leftCardinals = 3;
    int rightMasons = 0;
    int rightCardinals = 0;

    int ferries = 0; // Added the Ferry counter

    // true = left bank, false = right bank
    boolean boatOnLeft = true;

    //The Block that runs game.runGame() [this specific block compiles all of the functions we made into one]
    public static void main(String[] args) {
        EstradaLiz_MidtermsCJ1 game = new EstradaLiz_MidtermsCJ1();
        game.runGame();
    }

    // Runs the game loop (Block 26-71) [This Block is a compilation of all the necessary function blocks to run the game]
    public void runGame() {
        boolean playAgain;

        do {
            resetGame();
            boolean isPlaying = true;

            while (isPlaying == true) {
                printCurrentState();
                System.out.println("Number of ferries: " + ferries);

                // If they win, end the loop
                if (leftMasons == 0 && leftCardinals == 0) {
                    System.out.println("Everyone crossed safely.");
                    System.out.println("Game won!");
                    isPlaying = false;
                }
                // Else if they lose, end the loop
                else if ((leftCardinals > leftMasons && leftMasons > 0) ||
                        (rightCardinals > rightMasons && rightMasons > 0)) {
                    System.out.println("The Cardinals converted the Masons...");
                    System.out.println("Game lost!");
                    isPlaying = false;
                }
                // Else, the game is still going, so we ask for a move
                else {
                    System.out.println("How many will cross the other side?");
                    boolean validMove = processMove();

                    // Only add to ferries if the move didn't hit an error
                    if (validMove == true) {
                        ferries++;
                    }
                }
            }

            System.out.print("Play Again? (Y/N): ");
            String response = input.next();
            playAgain = response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
            System.out.println();

        } while (playAgain == true);

        System.out.println("Terminating program. Thank you for playing.");
        input.close();
    }

    // Resets the game back to its usual state... Essentially it rolls it back to their default number state (Block 74-81)
    public void resetGame() {
        leftMasons = 3;
        leftCardinals = 3;
        rightMasons = 0;
        rightCardinals = 0;
        boatOnLeft = true;
        ferries = 0;
    }

    // METHOD 1: This method builds the array (Block 84-92)
    public String[] buildVisuals(int count, String letter) {
        String[] visualArray = new String[count];

        for (int i = 0; i < count; i++) {
            visualArray[i] = letter;
        }

        return visualArray;
    }

    // METHOD 2: This method formats the array into a single string (Block 95-103)
    public String formatVisuals(String[] visualArray) {
        String finalString = "";

        for (int i = 0; i < visualArray.length; i++) {
            finalString = finalString + visualArray[i];
        }

        return finalString;
    }

    // Draws the game state without listing numbers (Block 106-133)
    public void printCurrentState() {
        // We call buildVisuals to get the array, then pass it to formatVisuals to get the string
        String[] leftMArray = buildVisuals(leftMasons, "M");
        String leftM = formatVisuals(leftMArray);

        String[] rightMArray = buildVisuals(rightMasons, "M");
        String rightM = formatVisuals(rightMArray);

        String[] leftCArray = buildVisuals(leftCardinals, "C");
        String leftC = formatVisuals(leftCArray);

        String[] rightCArray = buildVisuals(rightCardinals, "C");
        String rightC = formatVisuals(rightCArray);

        String leftBoat = "";
        String rightBoat = "";

        if (boatOnLeft == true) {
            leftBoat = "<B>";
        } else {
            rightBoat = "<B>";
        }

        // The %-3s adds padding so the river always lines up nicely
        System.out.printf("%-3s   | ~~~ | %s\n", leftM, rightM);
        System.out.printf("%-3s   | ~~~ | %s\n", leftC, rightC);
        System.out.printf("%-3s   | ~~~ | %s\n", leftBoat, rightBoat);
    }

    // Method to handle moving and checking logic (Block 136-188)
    public boolean processMove() {
        int moveM = 0;
        int moveC = 0;

        // Student-style try-catch block for catching invalid letters
        try {
            System.out.print("Masons: ");
            moveM = input.nextInt();

            System.out.print("Cardinals: ");
            moveC = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
            input.nextLine(); // Clears out the letter from the scanner so it doesn't infinite loop
            return false;
        }

        // Check if boat rule is broken
        if (moveM + moveC < 1 || moveM + moveC > 2 || moveM < 0 || moveC < 0) {
            System.out.println("Invalid number of people to send");
            return false;
        }

        // Logic depending on where the boat is
        if (boatOnLeft == true) {
            if (moveM > leftMasons || moveC > leftCardinals) {
                System.out.println("Not enough kinds of people to send");
                return false;
            }
            // Update left side
            leftMasons = leftMasons - moveM;
            leftCardinals = leftCardinals - moveC;
            // Update right side
            rightMasons = rightMasons + moveM;
            rightCardinals = rightCardinals + moveC;
            boatOnLeft = false;

        } else {
            if (moveM > rightMasons || moveC > rightCardinals) {
                System.out.println("Not enough kinds of people to send");
                return false;
            }
            // Update right side
            rightMasons = rightMasons - moveM;
            rightCardinals = rightCardinals - moveC;
            // Update left side
            leftMasons = leftMasons + moveM;
            leftCardinals = leftCardinals + moveC;
            boatOnLeft = true;
        }

        return true;
    }
}