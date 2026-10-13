import java.lang.Math;
import java.util.Scanner;

public class Practice10_Quiz2Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int simulate = 1000000;
        boolean keepRunning = true;

        double horizontalRate = 0;
        double verticalRate = 0;
        double diagonalRate = 0;

        System.out.println("=== Tic Tac Toe Simulator ===");
        System.out.println("Testing to see whether one strategy is better than the other.");

        while (keepRunning) {
            System.out.println("\nSelect a Strategy to test:");
            System.out.println("1. Horizontal Strategy (3 Possible Lines)");
            System.out.println("2. Vertical Strategy (3 Possible Lines)");
            System.out.println("3. Diagonal Strategy (2 Possible Lines)");
            System.out.println("4. Exit Program");
            System.out.print("Enter your choice (1-4): "); // Changed to print so input is on same line
            int choice = sc.nextInt();
            int wins = 0;

            switch(choice) {
                //Horizontal Strat
                case 1:
                    System.out.println("Simulating Horizontal Strat");
                    for (int i = 0; i < simulate; i++) {
                        int winningLine = (int)(Math.random()*8)+1; //calculation to generate a winning line from 1 to 8 since there are 8 possibilities
                        //Lines 1,2,3 represents the Horizontal
                        if (winningLine >= 1 && winningLine <= 3) {
                            wins++;
                        }
                    }
                    horizontalRate = (wins/(double)simulate) * 100; //Calculates the win rate of the strategy
                    System.out.println("Horizontal Win Rate: " + (Math.round(horizontalRate*100.0)/100.0) + "%"); //Rounds the win rate percentage
                    break;

                //Vertical Strat
                case 2:
                    System.out.println("Simulating Vertical Strat");
                    for (int i = 0; i < simulate; i++) {
                        int winningLine = (int)(Math.random()*8)+1; //calculation to generate a winning line from 1 to 8 since there are 8 possibilities
                        //4,5,6 simulates or represents the vertical
                        if (winningLine >= 4 && winningLine <= 6) {
                            wins++;
                        }
                    }
                    verticalRate = (wins/(double)simulate) * 100; // FIX: Assigned to verticalRate
                    System.out.println("Vertical Win Rate: " + (Math.round(verticalRate*100.0)/100.0) + "%"); // FIX: Used verticalRate and 100.0
                    break;

                //Diagonal Strat
                case 3:
                    System.out.println("Simulating Diagonal Strat"); // FIX: Text corrected
                    for (int i = 0; i < simulate; i++) {
                        int winningLine = (int)(Math.random()*8)+1; //calculation to generate a winning line from 1 to 8 since there are 8 possibilities
                        //7,8 represents the diagonal
                        if (winningLine == 7 || winningLine == 8) {
                            wins++;
                        }
                    }
                    diagonalRate = (wins/(double)simulate) * 100; // FIX: Assigned to diagonalRate
                    System.out.println("Diagonal Win Rate: " + (Math.round(diagonalRate*100.0)/100.0) + "%"); // FIX: Used diagonalRate and 100.0
                    break;

                //Exits program
                case 4:
                    keepRunning = false;
                    continue;

                default:
                    System.out.println("Invalid choice. Please select 1-4.");
                    continue; // FIX: Added continue to jump past the conclusion block
            }

            //Block that checks if the user has successfully ran all 3 simulations
            if (horizontalRate > 0 && verticalRate > 0 && diagonalRate > 0) {
                System.out.println("\nAll Strats Tested");
                if (horizontalRate > diagonalRate && horizontalRate > verticalRate) {
                    System.out.println("Conclusion: Horizontal is most likely to win");
                } else if (verticalRate > diagonalRate && verticalRate > horizontalRate) {
                    System.out.println("Conclusion: Vertical is the most likely to win");
                } else if (horizontalRate == verticalRate && horizontalRate > diagonalRate) {
                    System.out.println("Conclusion: Horizontal and Vertical are tied");
                }
            }
        }

        sc.close();
        System.out.println("Simulation terminated");
    }
}