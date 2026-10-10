import java.lang.Math;
import java.util.Scanner;

public class MontyHallSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int simulate = 1000000;
        boolean keepRunning = true;

        System.out.println("Monty Hall Game Simulation:");

        while (keepRunning) {
            System.out.println("Select a strategy to simulate it for 1,000,000 times");
            System.out.println("1. Stay in one door");
            System.out.println("2. Switch door strategy (Always change doors when given a chance)");
            System.out.println("3. Exit Simulation");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            int wins = 0;

            switch (choice) {
                //Stay in one door
                case 1:
                System.out.println("Running a million simulations to stay in one door...");
                for (int i = 0; i < simulate; i++) {
                    //These simulate the chance at which you win or lose in that door
                    int carDoor = (int)(Math.random()*3) + 1;
                    int myDoor = (int)(Math.random()*3) + 1;
                    if (carDoor == myDoor) {
                        wins++;
                    }
                }
                break;

                //Switch doors
                case 2:
                System.out.println("Running a million simulations to change doors...");
                for (int i = 0; i < simulate; i++) {
                    //These simulate the chance at which you win or lose in that door
                    int carDoor = (int)(Math.random()*3) + 1;
                    int myDoor = (int)(Math.random()*3) + 1;
                    if (carDoor != myDoor) {
                        wins++;
                    }
                }
                break;

                //Ends simulation
                case 3:
                    keepRunning = false;
                    continue;

                default:
                    System.out.println("Invalid choice... Try again.");
                    continue;
            }

            //calculates the percentage of wins
            double winPercentage = (wins/(double) simulate) * 100;

            //Rounds the output
            double cleanPercentage = Math.round(winPercentage * 100.0)/100.0;

            System.out.println("Total Wins: " + wins);
            System.out.println("Win Rate: " + cleanPercentage + "%");
        }
        sc.close();
        System.out.println("Thank you for running me. Have a nice day");
    }
}