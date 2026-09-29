import java.lang.Math;
import java.util.Scanner;

public class MontyHallSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int simulate = 1000000;

        System.out.println("Monty Hall Game Simulation:");
        System.out.println("Instruction: Choose a door, any door, you can change what door you wanna open.");
        //Note 1: User chooses a door, when they choose a door, another door opens and the game asks if they want to change their choice
        System.out.println("Choose a door (1-3): ");
        int choice = sc.nextInt();
        //Note 2: If user says no the game will simulate it a million times with that choice. After a million they will ask the user if they wanna play again
        //Note 3: Print the calculated percentage of success
        //Note 4: if user switches door the game will automatically switch choices of door after each uhh interval?
        System.out.println("Would you like to change doors? (1/2): ");
        choice = sc.nextInt();


        //Note 5: What if switch case question and simulate it from which one you wanna run...

    }
}