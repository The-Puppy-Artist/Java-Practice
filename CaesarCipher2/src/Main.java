import java.util.Scanner;

//Start of block
public class Main {
    public static void main(String[] args) {
        Cipher myCipher = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("== Caesar Cipher ==");
        System.out.println("1. Caesar");
        System.out.println("2. Keyboard");
        int choice = sc.nextInt();

        //Switch case starts here
        switch (choice) {
            case 1:
                myCipher = new CipherCaesar();
                break;

            case 2:
                myCipher = new Cipher();
                break;

            default:
        } // End of Switch case

        System.out.println("String Input: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                char out = myCipher.encrypt(input.charAt(i));
                System.out.println(out);

            } // End of If else statement in block
        } //End of For loop

    } //End of internal main block

} //End of whole block
