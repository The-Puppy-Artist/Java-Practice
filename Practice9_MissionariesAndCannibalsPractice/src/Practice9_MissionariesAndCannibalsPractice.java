import java.util.Scanner;

public class Practice9_MissionariesAndCannibalsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true; //Variable if the user wants to play again or not

        System.out.println("=== Missionaries And Cannibals Practice ===");
        System.out.println("Rule: Cannibals cannot outnumber Missionaries on either side");

        while (playAgain) {
            // Creates a fresh game state for this round
            RiverGame game = new RiverGame();

            while (game.isPlaying) {
                game.printCurrentState();

                //Ask for players input
                System.out.print("Missionaries to move: ");
                int moveM = input.nextInt();

                System.out.print("Cannibals to move: ");
                int moveC = input.nextInt();

                // Hand the inputs over to the game object to process
                game.processMove(moveM, moveC);
            }

            //Replay Prompt here (Now correctly outside the active game loop)
            System.out.print("\nWould you like to play again? (Y/N): ");
            String response = input.next();

            input.nextLine(); // clears the buffer

            if (!response.equalsIgnoreCase("y")) { //equalsIgnoreCase ignores upper/lower case differences
                playAgain = false;
            }
        } // <--- playAgain loop ends HERE!

        // Scanner closes only when the entire application is shutting down
        input.close();
        System.out.println("Thank you for playing");
    }
}