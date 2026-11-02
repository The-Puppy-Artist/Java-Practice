import java.util.Scanner;

public class TournamentManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean appRunning = true;

        System.out.println("=== 3-ROUND TOURNAMENT ARENA ===");

        //Outer loop that allows the tournament to be replayed
        while (appRunning) {
            //Initializing the Array
            //Initializing other variables related to the program
            Contestant[] contestants = new Contestant[5];
            int contestantCount = 0;
            int currentRound = 1;

            System.out.println("--- Starting a new Game ---");

            //Inner Loop that runs 1 to 3 rounds when active... Essentially this is the Main tournament loop
            while (currentRound <= 3) {

                System.out.println("\n==================================");
                System.out.println("CURRENT ROUND: " + currentRound + " / 3");
                System.out.println("==================================");
                displayRoster(contestants, contestantCount);

                System.out.println("\nActions:");
                System.out.println("1. Register a Contestant (Max 5)");
                System.out.println("2. Award / Deduct Points");
                System.out.println("3. Disqualify / Remove a Contestant");
                System.out.println("4. Advance to Next Round");
                System.out.println("5. End Competition Early");
                System.out.print("Select an option (1-5): ");

                int choice = getIntInput(sc);

                switch(choice) {
                    //Registers a user
                    case 1:
                        if (contestantCount >= 5) {
                            System.out.println("Registration full! Maximum of 5 contestants reached.");
                        } else {
                            System.out.print("Enter contestant name: ");
                            String name = sc.nextLine().trim();
                            contestants[contestantCount++] = new Contestant(name);
                            System.out.println(name + " has entered the tournament!");
                        }
                        break;

                    //Modify Points
                    case 2:
                        if (contestantCount == 0) {
                            System.out.println("No contestants registered yet.");
                            break;
                        }
                        int pIndex = pickContestant(sc, contestants, contestantCount);
                        if (pIndex != -1) {
                            Contestant target = contestants[pIndex];
                            System.out.println("Selected: " + target.name + " (Current Points: " + target.score + ")");
                            System.out.print("Enter points to add (use negative numbers to deduct): ");
                            int pts = getIntInput(sc);

                            if (pts >= 0) {
                                target.addPoints(pts);
                                System.out.println("Added " + pts + " points to " + target.name);
                            } else {
                                target.deductPoints(Math.abs(pts));
                                System.out.println("Deducted " + Math.abs(pts) + " points from " + target.name);
                            }
                        }
                        break;

                    //Disqualify a user
                    case 3:
                        if (contestantCount == 0) {
                            System.out.println("No contestants registered yet.");
                            break;
                        }
                        int dIndex = pickContestant(sc, contestants, contestantCount);
                        if (dIndex != -1) {
                            contestants[dIndex].disqualify();
                            System.out.println(contestants[dIndex].name + " has been DISQUALIFIED!");
                        }
                        break;

                    //Advance the round
                    case 4:
                        if (contestantCount == 0) {
                            System.out.println("You need at least one contestant before advancing the round!");
                        } else {
                            currentRound++;
                            if (currentRound <= 3) {
                                System.out.println("Advancing to Round " + currentRound + "!");
                            }
                        }
                        break;

                    //Force end of the current game
                    case 5:
                        currentRound = 999;
                        System.out.println("Tournament ended early.");
                        break;

                    default:
                        System.out.println("Invalid option. Please choose between 1 and 5.");

                } //End of Switch case

            }

            //Round 3 has ended: calculate the winner here
            if (currentRound == 4) {
                calculateAndPrintWinner(contestants, contestantCount);
            }

            //Replay mechanic here
            System.out.println("Would you like to run another tournament? (Y/N): ");
            String replay = sc.nextLine().trim();
            if (!replay.equalsIgnoreCase("y") && !replay.equalsIgnoreCase("yes")) {
                appRunning = false;
            }

        } //End of While loop for main while loop

        sc.close();
        System.out.println("Application terminated. Thank you!");

    }// Static void main end here

    //Below are some helper classes that help in the app

    //HELPER CLASS THAT CLEARS OUT LEFTOVERS
    public static int getIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid symbol! Please enter a valid number: ");
            sc.next();
        }
        int val = sc.nextInt();
        sc.nextLine(); // Clear scanner buffer
        return val;
    }

    //Helper class that prints out the roster
    public static void displayRoster(Contestant[] list, int count) {
        System.out.println("\n--- Current Scoreboard ---");
        if (count == 0) {
            System.out.println("[No contestants registered]");
            return;
        }
        for (int i = 0; i < count; i++) {
            Contestant c = list[i];
            String status = c.isDisqualified ? "[DISQUALIFIED]" : "[ACTIVE - " + c.score + " pts]";
            System.out.printf("%d. %-15s %s\n", (i + 1), c.name, status);
        }
    }

    //Helper class that helps the user pick a contestant by index
    public static int pickContestant(Scanner sc, Contestant[] list, int count) {
        displayRoster(list, count);
        System.out.print("Select contestant number (1-" + count + "): ");
        int choice = getIntInput(sc);

        if (choice < 1 || choice > count) {
            System.out.println("Invalid contestant selection.");
            return -1;
        }
        if (list[choice - 1].isDisqualified) {
            System.out.println("That contestant is already disqualified!");
            return -1;
        }
        return choice - 1;
    }

    //Lastly the helper class that helps calculates then prints out the winner... Also loops through
    //The array skipping disqualified players, then finds the highest score.
    public static void calculateAndPrintWinner(Contestant[] list, int count) {
        System.out.println("\n***********************************");
        System.out.println("       TOURNAMENT COMPLETE!        ");
        System.out.println("***********************************");

        Contestant winner = null;
        int highestScore = -1;

        for (int i = 0; i < count; i++) {
            Contestant c = list[i];
            // Only evaluate players who are still standing (not disqualified)
            if (!c.isDisqualified) {
                if (c.score > highestScore) {
                    highestScore = c.score;
                    winner = c;
                }
            }
        }

        if (winner == null) {
            System.out.println("No remaining active contestants. Nobody wins!");
        } else {
            System.out.println("THE WINNER IS: " + winner.name + " with " + winner.score + " points!");
        }
    }

}