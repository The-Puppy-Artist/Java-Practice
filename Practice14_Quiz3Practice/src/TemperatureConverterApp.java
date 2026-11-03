import java.util.Scanner;

public class TemperatureConverterApp {

    //Math conversion engine here
    public static double convert(double val, String from, String to) {
        if (from.equalsIgnoreCase(to)) {
            return val;
        }

        double celsius;

        //Switch Case start for source temp to Celsius Block
        switch (from.toUpperCase()) {
            case "C":
                celsius = val;
                break;

            case "F":
                celsius = (val - 32.00)*(5.00/9.00);
                break;

            case "K":
                celsius = val - 273.15;
                break;

            default:
                return val;

        } //Switch case Block 1 for source temp to Celsius

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //Switch case start of Celsius to target scale Block
        // FIX: Switch on 'to' (target unit), NOT 'from' (source unit)
        switch (to.toUpperCase()) {
            case "C":
                return celsius;

            case "F":
                return (celsius * (9.00/5.00)) + 32.00;

            case "K":
                return celsius + 273.15;

            default:
                return celsius;

        }

    } //End block of Conversion engine

    //Safety double input helper
    public static double getDoubleInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid number. Please enter a valid temperature value: ");
            sc.next();
        }
        double val = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        return val;
    }

    //Safe unit input validator
    public static String getValidUnit(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String unit = sc.nextLine().trim().toUpperCase();
            if (unit.equals("C") || unit.equals("F") || unit.equals("K")) {
                return unit;
            }
            System.out.println("Invalid unit! Enter C for Celsius, F for Fahrenheit, or K for Kelvin.");
        }
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //Public static void main here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Object array to store past conversions up to 100 conversions to be stored
        TemperatureRecord[] history = new TemperatureRecord[100];
        int historyCount = 0;

        //For future use case if user wants to stop using the application
        boolean appRunning = true;
        System.out.println("=== Universal Temperature Converter Ver. 1.0.0- ===");

        //inter loop of the program
        while(appRunning) {
            System.out.println("\nSelect an Option:");
            System.out.println("1. Convert Temperature");
            System.out.println("2. Reverse Previous Conversion from History");
            System.out.println("3. View Conversion History");
            System.out.println("4. Exit Program");
            System.out.print("Enter Choice (1-4): ");

            //Error checking block
            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // Clear buffer
            } else {
                System.out.println("Invalid choice. Please enter a number.");
                sc.nextLine();
                continue;
            }

            //Switch case block for user decision
            switch (choice) {
                case 1:
                    // Standard Conversion
                    double temp = getDoubleInput(sc, "\nEnter temperature value: ");
                    String fromUnit = getValidUnit(sc, "Enter source unit (C/F/K): ");
                    String toUnit = getValidUnit(sc, "Enter target unit (C/F/K): ");

                    double result = convert(temp, fromUnit, toUnit);
                    System.out.printf("Result: %.2f°%s = %.2f°%s\n", temp, fromUnit, result, toUnit);

                    if (historyCount < 100) {
                        history[historyCount++] = new TemperatureRecord(temp, fromUnit, result, toUnit);
                    }
                    break;

                case 2:
                    // Reverse Conversion from History
                    if (historyCount == 0) {
                        System.out.println("\nNo conversion history available to reverse yet. Run a conversion first!");
                        break;
                    }

                    System.out.println("\n--- Select an entry to reverse back ---");
                    for (int i = 0; i < historyCount; i++) {
                        history[i].displayRecord(i + 1);
                    }

                    System.out.print("Choose record number to reverse (1-" + historyCount + "): ");
                    int recIndex = -1;
                    if (sc.hasNextInt()) {
                        recIndex = sc.nextInt() - 1;
                        sc.nextLine();
                    } else {
                        sc.nextLine();
                    }

                    if (recIndex >= 0 && recIndex < historyCount) {
                        TemperatureRecord prev = history[recIndex];

                        // Reverse: feed converted value back into source unit
                        double reversed = convert(prev.convertedValue, prev.targetUnit, prev.originalUnit);

                        System.out.println("\n[Reversing Conversion]");
                        System.out.printf("Converted: %.2f°%s back to %.2f°%s\n",
                                prev.convertedValue, prev.targetUnit, reversed, prev.originalUnit);

                        // Save the reversed action as a new record
                        if (historyCount < 100) {
                            history[historyCount++] = new TemperatureRecord(
                                    prev.convertedValue, prev.targetUnit, reversed, prev.originalUnit
                            );
                        }
                    } else {
                        System.out.println("Invalid record selection.");
                    }
                    break;

                case 3:
                    // View History
                    System.out.println("\n--- Conversion Log ---");
                    if (historyCount == 0) {
                        System.out.println("No records logged yet.");
                    } else {
                        for (int i = 0; i < historyCount; i++) {
                            history[i].displayRecord(i + 1);
                        }
                    }
                    break;

                case 4:
                    appRunning = false;
                    System.out.println("Exiting temperature converter. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            } //Switch case end block here

        } //End block of while appRunning application loop

        sc.close();

    } //End block of PSVM. Be aware

} // Final and Main Block