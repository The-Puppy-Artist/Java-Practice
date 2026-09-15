/*
Student name: Estrada Gabriel Alistair T.
Editor used : intelliJ
*/
public class Q1 {
    public static final float PI = 3.14f;
    public static float computeCylinderVolume(float radius, float height){
        return PI*(radius*radius)*height;
    }
    public static float convertFtoK(float fahrenheit){
        return (273.15f+(fahrenheit-32)*((float) 5 /9));
    }
    public static float computeThreeYearInterest(float principal, float interest){
        interest = principal*(0.2f+1);
        return interest;

        //we gave up, I think I was getting close, emphasis on I think... This was wrong.
    }
    public static float computeAverage(float val1, float val2, float val3, float val4){
        return (val1+val2+val3+val4)/4;
    }
    public static int swapFourDigits(int number){
        return number%10000;
    }
    public static void main(String[] args) {
        System.out.println("=== computeCylinderVolume ===");
        System.out.printf("A: Expected: 30.03 | Actual: %5.2f\n",
                computeCylinderVolume(1.5f, 4.25f));
        System.out.printf("A: Expected: 25.12 | Actual: %5.2f\n",
                computeCylinderVolume(2, 2));
        System.out.printf("A: Expected: 24.63 | Actual: %5.2f\n",
                computeCylinderVolume(0.25f, 125.5f));
        System.out.println("\n=== convertFtoK ===");
        System.out.printf("A: Expected: 255.37 | Actual: %6.2f\n",
                convertFtoK(0));
        System.out.printf("A: Expected: 273.15 | Actual: %6.2f\n",
                convertFtoK(32.0f));
        System.out.printf("A: Expected: 311.76 | Actual: %6.2f\n",
                convertFtoK(101.5f));
        System.out.println("\n=== computeThreeYearInterest ===");
        System.out.printf("A: Expected: 172.80 | Actual: %5.2f\n",
                computeThreeYearInterest(100.0f, 0.2f));
        System.out.printf("B: Expected: 578.81 | Actual: %5.2f\n",
                computeThreeYearInterest(500.0f, 0.05f));
        System.out.printf("C: Expected: 352.90 | Actual: %5.2f\n",
                computeThreeYearInterest(150.0f, 0.33f));
        System.out.println("\n=== computeAverage ===");
        System.out.printf("A: Expected: 7.00 | Actual: %5.2f\n",
                computeAverage(4,6,8,10));
        System.out.printf("B: Expected: 0.00 | Actual: %5.2f\n",
                computeAverage(-5,0,4,1));
        System.out.printf("C: Expected: 5.85 | Actual: %5.2f\n",
                computeAverage(92.5f,-128.3f, 71.1f, -11.9f));
        System.out.println("\n=== swapFourDigits ===");
        System.out.println("A: Expected: 3412 | Actual: " +
                swapFourDigits(1234));
        System.out.println("B: Expected: 8998 | Actual: " +
                swapFourDigits(9889));
        System.out.println("C: Expected: 7492 | Actual: " +
                swapFourDigits(9274));
    }
}