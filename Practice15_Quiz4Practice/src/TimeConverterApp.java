import java.util.Scanner;

public class TimeConverterApp {

    public static double getDoubleInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid number. Please enter a valid number: ");
            sc.next();
        }
        double val = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Polymorphic array: holds up to 100 base or child instances
        TimeConverter[] history = new TimeConverter[100];
        int historyCount = 0;

        boolean appRunning = true;
        System.out.println("=== Time Unit Converter (Inheritance Demo) ===");

        while (appRunning) {
            System.out.println("\nSelect an Option:");
            System.out.println("1. Standard Time Conversion (sec, min, hr, day)");
            System.out.println("2. Astronomical / Calendar Conversion (day, year, leap year)");
            System.out.println("3. Reverse a Previous Conversion from History");
            System.out.println("4. View Conversion History");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    // Standard Converter
                    double val = getDoubleInput(sc, "\nEnter value to convert: ");
                    System.out.print("Enter source unit (s, m, h, d): ");
                    String from = sc.nextLine().trim();
                    System.out.print("Enter target unit (s, m, h, d): ");
                    String to = sc.nextLine().trim();

                    // Instantiate Child 1
                    StandardTimeConverter standard = new StandardTimeConverter(val, from, to);
                    standard.convert();
                    System.out.print("Result: ");
                    standard.displayConversion();

                    if (historyCount < 100) {
                        history[historyCount++] = standard;
                    }
                    break;

                case 2:
                    // Astronomical Converter
                    double aVal = getDoubleInput(sc, "\nEnter value to convert: ");
                    System.out.print("Enter source unit (d for days, y for year, ly for leap year): ");
                    String aFrom = sc.nextLine().trim();
                    System.out.print("Enter target unit (d for days, y for year, ly for leap year): ");
                    String aTo = sc.nextLine().trim();

                    // Instantiate Child 2
                    AstronomicalTimeConverter astro = new AstronomicalTimeConverter(aVal, aFrom, aTo);
                    astro.convert();
                    System.out.print("Result: ");
                    astro.displayConversion();

                    if (historyCount < 100) {
                        history[historyCount++] = astro;
                    }
                    break;

                case 3:
                    // Reverse Conversion
                    if (historyCount == 0) {
                        System.out.println("\nNo history available to reverse yet!");
                        break;
                    }

                    System.out.println("\n--- Select an entry to reverse ---");
                    for (int i = 0; i < historyCount; i++) {
                        System.out.print("[" + (i + 1) + "] ");
                        history[i].displayConversion();
                    }

                    System.out.print("Choose record number (1-" + historyCount + "): ");
                    int recIndex = -1;
                    if (sc.hasNextInt()) {
                        recIndex = sc.nextInt() - 1;
                        sc.nextLine();
                    } else {
                        sc.nextLine();
                    }

                    if (recIndex >= 0 && recIndex < historyCount) {
                        TimeConverter prev = history[recIndex];

                        // Reverse: swap convertedValue to inputValue, and swap toUnit with fromUnit
                        TimeConverter reversed;
                        if (prev instanceof StandardTimeConverter) {
                            reversed = new StandardTimeConverter(prev.getConvertedValue(), prev.getToUnit(), prev.getFromUnit());
                        } else {
                            reversed = new AstronomicalTimeConverter(prev.getConvertedValue(), prev.getToUnit(), prev.getFromUnit());
                        }

                        reversed.convert();
                        System.out.print("\n[Reversed Result]: ");
                        reversed.displayConversion();

                        if (historyCount < 100) {
                            history[historyCount++] = reversed;
                        }
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;

                case 4:
                    // View History
                    System.out.println("\n--- Conversion History ---");
                    if (historyCount == 0) {
                        System.out.println("Log is currently empty.");
                    } else {
                        for (int i = 0; i < historyCount; i++) {
                            System.out.print("[" + (i + 1) + "] ");
                            history[i].displayConversion();
                        }
                    }
                    break;

                case 5:
                    appRunning = false;
                    System.out.println("Exiting Time Converter. Have a great exam!");
                    break;

                default:
                    System.out.println("Invalid option. Please enter 1 to 5.");
            } //Switch case end block
        } //While application run logic bracket end here

        sc.close();
    } //Main Bracket block end here
} //End bracket of whilee class