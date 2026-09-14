public class Practice5_JavaQuiz1Practice {

    //Convert Celsius to Fahrenheit function
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //Return true if number is even, false if odd
    public static boolean isEven(int num) {
                return num%2 == 0;
    }

    //return larger of the two numbers
    public static int getMax(int a, int b) {
            if (a > b) {
                return a;
            } else if (a < b) {
                return b;
            } else {
                return a;
            }

    }

    //return final price after adding 12% tax
    public static double addTax(double basePrice) {
        return basePrice+(0.12*basePrice);
    }

    public static void main(String[] args) {

        System.out.println("A: " + celsiusToFahrenheit(5));
        System.out.println("B: " + celsiusToFahrenheit(24));
        System.out.println("A: " + isEven(46));
        System.out.println("B: " + isEven(67));
        System.out.println("A: " + getMax(46, 13));
        System.out.println("B: " + getMax(1300, 13));
        System.out.println("A: " + getMax(13, 13));
        System.out.println("A: " + addTax(44000));

    }

}