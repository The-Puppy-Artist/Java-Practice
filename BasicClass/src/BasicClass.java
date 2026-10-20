import java.lang.math;

public class BasicClass {
    private double first, second;

    public BasicClass(double firstVal, double secondVal) {
        first = firstVal;
        second = secondVal;
    }

    public double exclusiveAdd() {
        return first + second;
    }

    public static void main(String[] args) {
        int sum1 = add(5,6);

        BasicClass bc = new BasicClass(2.5d, 3.5d);
        double sum2 = bc.exclusiveAdd();

        System.out.printf("Sum1: %d\nSum2: %2f\n", sum1, sum2);
    }

}

