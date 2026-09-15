import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActivityBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Input: ");
            String str = read.readLine();
            int number = Integer.parseInt(str);

            System.out.println("Answer: " + (number * number));
        } catch (Exception e) {
            System.out.println("Not Whole :<");
        }

    }
}