public class Practice12_Quiz2Practice {

    // 1. FACTORIAL
    // Rule: result must start at 1, not 0!
    public static long getFactorial(int n) {
        long result = 1; // 1 is the identity for multiplication
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 2. SUM OF EVEN DIGITS
    // Using while-modulo extraction:
    public static int sumEvenDigits(int num) {
        int sum = 0;
        num = Math.abs(num); // Handles negatives safely

        while (num > 0) {
            int digit = num % 10; // 1. Peel off the last digit
            if (digit % 2 == 0) { // 2. Check if that specific digit is even
                sum += digit;
            }
            num /= 10;            // 3. Drop that digit
        }
        return sum;
    }

    // 3. IS ARMSTRONG
    // Guard clause first, then process digits
    public static boolean isArmstrong(int num) {
        // If it is not 3 digits, immediately rule it out
        if (num < 100 || num > 999) {
            return false;
        }

        int original = num; // Save original before chopping down num
        int sumCubes = 0;

        while (num > 0) {
            int digit = num % 10;
            sumCubes += (digit * digit * digit);
            num /= 10;
        }

        return sumCubes == original;
    }

    // 4. GREATEST COMMON DIVISOR (Simple 'for' loop version)
    // Start at the smaller of the two numbers and count DOWN to 1.
    // The first common factor you hit is guaranteed to be the greatest!
    public static int getGCD(int a, int b) {
        int smaller = Math.min(Math.abs(a), Math.abs(b));

        for (int i = smaller; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i; // Found the greatest common divisor!
            }
        }
        return 1;
    }

    // 5. TAX BRACKET CALCULATOR
    // Standard conditional tiers
    public static double calculateTax(double income) {
        if (income <= 10000) {
            return 0.0;
        } else if (income <= 30000) {
            // 10% on anything exceeding 10,000
            return (income - 10000) * 0.10;
        } else {
            // 2,000 flat from previous bracket + 20% on whatever is over 30,000
            return 2000.0 + ((income - 30000) * 0.20);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Quiz 2 Practice ===");

        // 1. Factorial tests
        System.out.println("1. Factorial 5: " + getFactorial(5) + " (Expected: 120)");
        System.out.println("   Factorial 0: " + getFactorial(0) + " (Expected: 1)");

        // 2. Sum of Even Digits tests
        System.out.println("\n2. Sum Even Digits (2457): " + sumEvenDigits(2457) + " (Expected: 6)");
        System.out.println("   Sum Even Digits (1357): " + sumEvenDigits(1357) + " (Expected: 0)");

        // 3. Armstrong tests
        System.out.println("\n3. Armstrong (153): " + isArmstrong(153) + " (Expected: true)");
        System.out.println("   Armstrong (123): " + isArmstrong(123) + " (Expected: false)");

        // 4. GCD tests
        System.out.println("\n4. GCD(24, 18): " + getGCD(24, 18) + " (Expected: 6)");
        System.out.println("   GCD(100, 25): " + getGCD(100, 25) + " (Expected: 25)");

        // 5. Tax tests
        System.out.println("\n5. Tax (8000): " + calculateTax(8000) + " (Expected: 0.0)");
        System.out.println("   Tax (20000): " + calculateTax(20000) + " (Expected: 1000.0)");
        System.out.println("   Tax (40000): " + calculateTax(40000) + " (Expected: 4000.0)");
    }
}