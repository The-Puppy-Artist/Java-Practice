import java.util.Scanner;

public class ClassActivity1 {
    public static void main(String[] args) throws Exception {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        do {


            System.out.println("Input number: ");
            number = sc.nextInt();

            if(number > 0) {
                sum += number;
            }

        } while(number > 0);

        System.out.println("Sum: " + sum);
        sc.close();

    }
}