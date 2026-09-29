package com.mycompany._iterativestatements;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input max: ");
        int max = sc.nextInt();

        System.out.println("\n--- Only even numbers ---");
        int i = -1;
        while (true) {
            i++;
            if (i % 2 == 1) continue; // skips
            if (i + 2 < max)
                System.out.print(i + ", ");
            else {
                System.out.println(i);
                break; // exits loop
            }
        }

        System.out.println("\n--- Only odd numbers? ---");
        i = 0;
        while (i < max) {
            System.out.print(i);
            if (i++ % 2 == 0)
                System.out.println(" - " + i);
            else
                System.out.println();
        }
    }
}
