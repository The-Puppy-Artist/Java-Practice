import java.util.Scanner; //Imports the required utilitarian Function we need, that being Scanner

public class Practice1_Calculator_V1 { //Exterior Wall structure of the program

    //Here is where the logic will be written... Note don't write a public static within a Public static.
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) { //A gatekeeper to stop the user from dividing 0
            System.out.println("Error: Cant Divide 0");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) { //Internal Body of the Program

        Scanner scanner = new Scanner(System.in); //The initialization of Scanner, and its name is scanner

        System.out.println("--- Calculator V1 ---");
        System.out.println("Ready for Input...");

        //User Input with Scanner
        System.out.println("Enter the first Number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the Operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second Number: ");
        double b = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        //Switch case logic for operators
        switch (operator) {
            case '+':
                result = add(a,b);
                break;

            case '-':
                result = subtract(a,b);
                break;

            case '*':
                result = multiply(a,b);
                break;

            case '/':
                result = divide(a,b);
                break;

            default:
                System.out.println("Error: Unrecognized Operator");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close(); //Closes the Scanner when its finished doing its job, this will stop memory leaks

    }

}