package com.mycompany._keyboardinputs;

// imports are used to utilize existing functionality
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class KeyboardInputs {
    public static void main(String[] args) throws IOException {
        // User input can be read by using a buffered reader
        BufferedReader input1 =
            new BufferedReader(new InputStreamReader(System.in));
            
        // The input should be converted to the proper data-type
        // for it to be used.
        System.out.print  ("Input int: ");
        int value1 = Integer.parseInt(input1.readLine());
        System.out.println("Int value: " + value1);

        // The scanner class allows user input to be obtained and
        // provides some presets for easier use.
        Scanner input2 = new Scanner(System.in);
        
        System.out.print  ("Input int: ");
        int value2 = input2.nextInt();
        System.out.println("Int value: " + value2);
        
        // Scanners should always be closed after use.
        input2.close();
    }
}
