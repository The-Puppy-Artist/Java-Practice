public class Practice4_SchoolTask2{
    public static double toInch (double cm){
        return 0.394*(cm);
    }

    public static double computeAreaOfCircle(double r){
        float pi;
        pi = 3.1415f;
        return pi*(r*r);
    }

    public static boolean isPass(double grade, double pass){
        if (grade < 70) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumToTarget(int target){
        return (target*(target+1))/2;
    }
    public static int lastDigit(int num){
        return num%10;
    }

    public static void main(String[] args) {
        System.out.println("A: "+ toInch(2.5f));
        System.out.println("B: "+ toInch(10f));
        System.out.println("A: "+ computeAreaOfCircle(2.5f));
        System.out.println("B: "+ computeAreaOfCircle(10));
        System.out.println("A: "+ isPass(80, 70));
        System.out.println("B: "+ isPass(60, 70));
        System.out.println("A: "+ sumToTarget(9));
        System.out.println("B: "+ sumToTarget(16));
        System.out.println("A: "+ lastDigit(9));
        System.out.println("B: "+ lastDigit(16));
    }

}