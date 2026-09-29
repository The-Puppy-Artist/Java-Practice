package com.mycompany._iterativestatements;

import java.util.Scanner;

public class LoopBasics {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i, max;

        System.out.print("Input max: ");
        max = sc.nextInt();

        // while loop
        i = 0;
        System.out.print("While   : ");
        while (i < max) {
            if (i == 0)
                System.out.print("0");
            else
                System.out.print(", " + i);
            i++;
        }
        System.out.println();

        // Do-While loop
        i = 0;
        System.out.print("Do-While: ");
        do {
            if (i + 1 < max)
                System.out.print(i + ", ");
            else
                System.out.println(i);
            i++;
        } while (i < max);

        // For loop
        System.out.print("For loop: ");
        for (int j = 0; j < max; j++) {
            System.out.printf("%d%c ", j, (j + 1 < max) ? ',' : '\n');
        }

        // Advance for loop
        System.out.println("\nAdvance:");
        for (int a = 0, b = max; a <= b; a++, b--) {
            int c = a + b;
            System.out.printf("%d) %d up | %d down\n", c, a, b);
        }
    }
}
