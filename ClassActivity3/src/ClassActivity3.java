import java.util.Scanner;

public class ClassActivity3 {
    public static void main(String[] args) {
        int num;
        int length = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Instructions: Input a number and it will be printed in words");
        System.out.println("Input number: ");
        num = sc.nextInt();
        String numWord = "";

        switch (num) {
            case 0:
                System.out.println(" Zero ");
                break;
            case 1:
                System.out.println(" One ");
                break;
            case 2:
                System.out.println(" Two ");
                break;
            case 3:
                System.out.println(" Three ");
                break;
            case 4:
                System.out.println(" Four ");
                break;
            case 5:
                System.out.println(" Five ");
                break;
            case 6:
                System.out.println(" Six ");
                break;
            case 7:
                System.out.println(" Seven ");
                break;
            case 8:
                System.out.println(" Eight ");
                break;
            case 9:
                System.out.println(" Nine ");
                break;
        }

        for (int i = 0; i < length; i++) {
            p
        }

        System.out.println("Output: " + numWord);

    }

}