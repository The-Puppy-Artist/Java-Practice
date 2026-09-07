import java.util.Scanner;
import java.util.Random;

public class Practice2_RandomNumberGame {
    static void main(String[] args) {
        //Tools or functions to be used Initialized here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //The main star of the Show that gives us random number

        System.out.println("=== Terminal Guessing Game Ver.1 ===");

        boolean playAgain = true;

        while (playAgain) {
            playRound(scanner, random);

            System.out.println("Do you wanna play again? (Y/N): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("y")) {
                playAgain = false;
                System.out.println("Thanks for playing! Have a nice day!");
            }

        }

        //Cleaning function tool so that the program closes up cleanly
        scanner.close();
    }

    public static void playRound(Scanner scanner, Random random) {

        int targetNumber = random.nextInt(10) + 1;
        int maxAttempts = 3;

        System.out.println("Thinking of a number between 1 and 10");

        //Inner loop that grants 3 attempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt " + attempt + "/" + maxAttempts + " - Enter Guess: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("JACKPOT!");
                return;
            } else if (guess < targetNumber) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
        }

        System.out.println("Out of Attempts! The number was " + targetNumber + ".");
    }

}