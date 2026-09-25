import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class Practice7_ScannerAndBufferedReader {
    public static void scannerTest() {
        Scanner Input = new Scanner(System.in);
        System.out.println("How old are you?: ");
        int age = Input.nextInt();
         if (age < 18) {
             System.out.println("You are " + age + ". You are not an adult yet.");
         } else {
             System.out.println("You are " + age + ". You are an adult.");
         }
        // Input.close(); = Dont put Before another input...
    }

    public static void bufferedTest() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Are you afraid? (1/2): ");
        int Answer = Integer.parseInt(reader.readLine());

        if (Answer == 1) {
            System.out.println("You are a green lantern!");
        } else if (Answer == 2) {
            System.out.println("Awww...");
        } else {
            System.out.println("...");
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("=== User Input Drill 1 ===");
        scannerTest();
        bufferedTest();
    }

}

