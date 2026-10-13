/*
Student name: Estrada Gabriel
Editor used : intelliJ
*/
public class Q2 {
    //get sign
    public static int getSign(int value){
        if (value > 0) {
            return 1;
        } else if (value < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    //convert gram block
    public static float convertGram(float grams, char type){
        switch (type) {
            case 'o':
                return grams/(float)28.3495;

            case 'k':
                return grams/1000;

            case 'l':
                return grams/(float)453.5924;
        }
        return 0;
    }

    //same sequence block
    public static int sameSequence(int num1, int num2){
            String strA = String.valueOf(num1);
            String strB = String.valueOf(num2);

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

    //compute single digit block
    public static int computeSingleDigit(int number){
        while (number > 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                    number /= 10;
            }
            number = sum;
        }
        return number;
    }

    //is Prime block
    public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("=== getSign ===");
        System.out.printf("A: Expected: -1 | Actual: %2d\n",
                getSign(-20));
        System.out.printf("A: Expected: 1 | Actual: %2d\n",
                getSign(63));
        System.out.printf("A: Expected: 0 | Actual: %2d\n",
                getSign(0));

        System.out.println("\n=== convertGram ===");
        System.out.printf("A: Expected: 112.88 | Actual: %6.2f\n",
                convertGram(3200,'o'));
        System.out.printf("A: Expected: 14.11 | Actual: %6.2f\n",
                convertGram(6400,'l'));
        System.out.printf("A: Expected: 4.70 | Actual: %6.2f\n",
                convertGram(4700,'k'));

        System.out.println("\n=== sameSequence ===");
        System.out.printf("A: Expected: 4 | Actual: %2d\n",
                sameSequence(192168, 191167));
        System.out.printf("B: Expected: 0 | Actual: %2d\n",
                sameSequence(92323, 2323));
        System.out.printf("C: Expected: 8 | Actual: %2d\n",
                sameSequence(11211322,11211322));

        System.out.println("\n=== computeSingleDigit ===");
        System.out.printf("A: Expected: 5 | Actual: %d\n",
                computeSingleDigit(92835122));
        System.out.printf("B: Expected: 4 | Actual: %d\n",
                computeSingleDigit(8127472));
        System.out.printf("C: Expected: 9 | Actual: %d\n",
                computeSingleDigit(999999999));

        System.out.println("\n=== isPrime ===");
        System.out.println("A: Expected: true | Actual: " +
                isPrime(11));
        System.out.println("B: Expected: false | Actual: " +
                isPrime(32));
        System.out.println("C: Expected: false | Actual: " +
                isPrime(123));
    }
}