import java.util.Scanner;

public class Practice8_LoopsAndControlFlows {

    public static void validateAndPrintDate(int month, int day, int year) {
        String monthWord = "";
        boolean isValid = true;

        //Switch case for months
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
        }

        //Validation if the month has 30 days
        if (day < 1){
            isValid = false;
        } else if (month == 2 && day > 28) {
            isValid = false;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11 ) && day > 30) {
            isValid = false;
        } else if (day > 31) {
            isValid = false;
        }

        if (isValid) {
            System.out.println(monthWord + "/" + day + "/" + year);
        } else {
            System.out.println("Not valid date... Try again");
        }

    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Date Validator System ===");

        while (keepRunning) {
            //Three Integer inputs
            System.out.println("1. Enter Month (1-12): ");
            int month = input.nextInt();

            System.out.println("1. Enter Day: ");
            int day = input.nextInt();

            System.out.println("1. Enter Year: ");
            int year = input.nextInt();

            validateAndPrintDate(month, day, year);

            System.out.print("\nDo you want to validate another date? (y/n): ");
            String response = input.next();
            if (!response.equalsIgnoreCase("y")) {
                keepRunning = false;
            }
        }

        input.close();
        System.out.println("System shutting down...");

    }
}