public class Practice6_JavaQuiz1Practice {

    //Convert Celsius to Fahrenheit function
    public static double calculatePerimeter(double length, double width) {
        return 2*(width+length);
    }

    //Return true if person is of voting age
    public static boolean isVotingAge(int age) {
        return age >= 18;
    }

    //return smallest of the two numbers
    public static int getMin(int a, int b) {
        if (a > b) {
            return b;
        } else if (a < b) {
            return a;
        } else {
            return a;
        }

    }

    //will determine whether it is a multiple of 5
    public static boolean isMultipleOfFive(int num) {
        return num%5 == 0;
    }

    public static void main(String[] args) {

        System.out.println("A: " + calculatePerimeter(5, 2));
        System.out.println("B: " + calculatePerimeter( 5, 5));
        System.out.println("B: " + isVotingAge(18));
        System.out.println("A: " + isVotingAge(6));
        System.out.println("B: " + getMin(5, 1));
        System.out.println("A: " + getMin(3, 5));
        System.out.println("B: " + isMultipleOfFive(125));
        System.out.println("A: " + isMultipleOfFive(44));

    }

}