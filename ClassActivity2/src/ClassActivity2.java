import java.util.Scanner;

public class ClassActivity2 {
    public static void main(String[] args) throws Exception {
        int place;
        int prev1, prev2, current = 0;
        Scanner sc = new Scanner(System.in);
            
            System.out.println("Input number: ");
            place = sc.nextInt();

        if (place == 0) {
            System.out.println("Answer: 0");
        } else if (place == 1) {
            System.out.println("Answer: 1");
        } else {
            prev2 = 0;
            prev1 = 1;
            current = 0;
            
            for (int i = 2; i <= place; i++) {
                current = prev2 + prev1;
                prev2 = prev1;
                prev1 = current;
            }
        }

        System.out.println("Answer: " + current);
        sc.close();

    }
}