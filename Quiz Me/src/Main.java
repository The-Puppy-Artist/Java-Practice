import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Questions[] bank = new Questions[100];
        int questionCount = 0;

        bank[questionCount++] = new Questions(
                "What does DC stand for in Washington DC?", "District of Columbia", "Da Capital",
                "District of Capital"
        );

        bank[questionCount++] = new Questions(
                "Where is the Grand Canyon Located in?", "Arizona", "Tennessee",
                "Missouri"
        );

        bank[questionCount++] = new Questions(
                "Whats the capital of Canada?", "Ottawa", "Toronto",
                "Vancouver"
        );

        System.out.println("=== Geography Test ===");

        boolean running = true; // Control flag to exit the loop cleanly

        while (running) {
            System.out.println("\nWhat'd You Like to do?");
            System.out.println("1. Answer the test?");
            System.out.println("2. Add a Question");
            System.out.println("3. Exit Program");
            System.out.print("Choose an option (1-3): ");

            //Checker to see whether the user entered the wrong value
            int choice = -1;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // Clear scanner buffer
            } else {
                System.out.println("Invalid symbol. Please enter a number.");
                sc.nextLine(); // Clears garbage input
                continue;
            }

            switch(choice) {
                //Take the quiz
                case 1:
                    if (questionCount == 0) {
                        System.out.println("No questions to be asked, add questions");
                    } else if (questionCount > 0) {
                        //Math.Random() gives us a random index from 0 to (questionCount-1)
                        int randomIndex = (int)(Math.random()*questionCount);
                        Questions quizMe = bank[randomIndex];

                        quizMe.displayQuestions();

                        System.out.print("Your Answer: ");
                        String answer = sc.nextLine().trim();

                        if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase(quizMe.choice1)) {
                            System.out.println("Correct! Well done.");
                        } else {
                            System.out.println("Incorrect! The correct answer is: " + quizMe.choice1);
                        }
                    }
                    break;

                //Add a question function
                case 2:
                    if (questionCount >= 100) {
                        System.out.println("Error: Question bank full...");
                    } else {
                        System.out.print("Enter Question text: ");
                        String txt = sc.nextLine();

                        System.out.print("Enter Correct Answer (Choice A): ");
                        String choice1 = sc.nextLine();

                        System.out.print("Enter Wrong Answer (Choice B): ");
                        String choice2 = sc.nextLine();

                        System.out.print("Enter Wrong Answer (Choice C): ");
                        String choice3 = sc.nextLine();

                        //Create and slot the question directly into the bank
                        bank[questionCount] = new Questions(txt, choice1, choice2, choice3);
                        questionCount++;

                        System.out.println("Question added to the question bank.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using our program. Terminating Program...");
                    running = false; // Stops the while loop
                    break;

                default:
                    System.out.println("Invalid option. Please enter 1, 2, and 3");
            }
        }

        sc.close();
        System.out.println("Thank you for running our program.");
    }
}