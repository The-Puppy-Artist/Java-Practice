public class Practice3_SchoolTask1 {
    public static double circleArea(double radius) {
        return 3.14*(radius*radius);
    }

    public static double squareArea(double side) {
        return side*side;
    }

    public static void main(String args[]) {

        double radius = 3;
        double side = 2.5;

                System.out.println("Area Circle: " + circleArea(radius));
                System.out.println("Area Square: " + squareArea(side));
                System.out.println("Fit Inside: " + (radius*2<side));
    }

}