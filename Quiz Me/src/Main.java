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

        while (true) {
            System.out.println("What'd You Like to do?");
            System.out.println("1. Answer the test?");
            System.out.println("2. Add a Question");
            System.out.println("3. Exit Program");

            char choice = 0;

            switch(choice) {
                case '1':
                    if (questionCount == 0) {
                        System.out.println("No questions to be asked, add questions");
                    } else if (questionCount > 0) {
                        int randomIndex = (int)(Math.random()*questionCount);
                        Questions quizMe = bank[randomIndex];

                        quizMe.displayQuestions();

                        System.out.println("Your Answer: ");

                    }
                    break;

                case '2':

                    break;

                case '3':
                    System.out.println("Thank you for using our program.Terminating Program");
                    sc.close();
                    break;

            }

        }

    }
}