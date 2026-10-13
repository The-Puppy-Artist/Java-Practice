public class Practice11_Quiz2Practice {

    //Get Sign
    //Returns 1 if positive, -1 if negative, 0 if zero
    public static int getSign(int a) {
        if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        } else {
            return 0;
        }
    }


    //Distance Converter
    public static double convertDistance(double meters, String choice) {
        switch (choice) {
            case "mile":
                return meters * 0.000621371; // Minor note: 1 meter is ~0.000621371 miles

            case "yard":
                return meters * 1.09361;

            case "foot":
                return meters * 3.28084;

            case "Inch":
                return meters * 39.3701;

            case "nMi":
                return meters * 0.000539957;

            default:
                return meters;
        }
    }


    //Same sequence
    public static int sameSequence(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        if (strA.length() != strB.length()) {
            return 0;
        }

        int matches = 0;
        for (int i = 0; i < strA.length(); i++) {
            if (strA.charAt(i) == strB.charAt(i)) {
                matches++;
            }
        }
        return matches;
    }

    //Compute Single digits: sums digits using modulo
    public static int computeSingDigit(int a) {
        while (a >= 10) {
            int sum = 0;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            a = sum; // FIX: Update 'a' with the calculated sum so the loop can reduce it further
        }
        return a;
    }

    //Is Prime, checks if the number is prime
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Count digit, uses modulo to extract digits and count how many it has
    public static int countDigit(int number, int targetDigit) {
        if (number == 0 && targetDigit == 0) return 1;
        number = Math.abs(number);
        int count = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == targetDigit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    //Reverse Number: Reverses a number
    public static int reversal(int a) {
        int reversed = 0;
        while (a != 0) {
            int digit = a % 10;
            reversed = (reversed * 10) + digit;
            a /= 10;
        }
        return reversed;
    }

    //Is Palindrome Helper: Uses reversal to check
    public static boolean isPalindrome(int a) {
        if (a < 0) return false;
        return a == reversal(a);
    }

    //Convert temperature
    public static double convertTemperature(double val, char targetScale) {
        switch (Character.toLowerCase(targetScale)) {
            case 'c':
                return (val - 32.0) * (5.0 / 9.0);
            case 'f':
                return (val * (9.0 / 5.0)) + 32.0;
            default:
                return val;
        }
    }

    //Is Leap Year, checks if the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }


    public static void main(String[] args) {

        System.out.println("=== Quiz 2 Practice ===");
        System.out.println("1. getSign(-15): " + getSign(-15) + " (Expected: -1)");
        System.out.println("   getSign(42): " + getSign(42) + " (Expected: 1)");
        System.out.println("   getSign(0): " + getSign(0) + " (Expected: 0)");

        System.out.println("\n2. convertDistance(500, \"mile\"): " + convertDistance(500, "mile"));
        System.out.println("   convertDistance(500, \"yard\"): " + convertDistance(500, "yard"));
        System.out.println("   convertDistance(500, \"foot\"): " + convertDistance(500, "foot"));

        System.out.println("\n3. sameSequence(779988, 769238): " + sameSequence(779988, 769238) + " (Expected: 3)");
        System.out.println("   sameSequence(1234, 123): " + sameSequence(1234, 123) + " (Expected: 0 - mismatched lengths)");

        System.out.println("\n4. computeSingleDigit(1359): " + computeSingDigit(1359) + " (Expected: 9)");
        System.out.println("   computeSingleDigit(779988): " + computeSingDigit(779988) + " (Expected: 3)");

        System.out.println("\n5. isPrime(7): " + isPrime(7) + " (Expected: true)");
        System.out.println("   isPrime(20): " + isPrime(20) + " (Expected: false)");

        System.out.println("\n=== High-Yield Extra Practice ===");
        System.out.println("6. countDigit(779988, 7): " + countDigit(779988, 7) + " (Expected: 2)");
        System.out.println("7. reverseNumber(12345): " + reversal(12345) + " (Expected: 54321)");
        System.out.println("8. isPalindrome(12321): " + isPalindrome(12321) + " (Expected: true)");
        System.out.println("   isPalindrome(12345): " + isPalindrome(12345) + " (Expected: false)");
        System.out.println("9. convertTemperature(100, 'c'): " + convertTemperature(100, 'c') + " (Expected ~37.78)");
        System.out.println("10. isLeapYear(2024): " + isLeapYear(2024) + " (Expected: true)");
        System.out.println("    isLeapYear(1900): " + isLeapYear(1900) + " (Expected: false)");
    }
}