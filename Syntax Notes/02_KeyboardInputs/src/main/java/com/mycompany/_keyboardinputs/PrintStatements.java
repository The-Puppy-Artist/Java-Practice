package com.mycompany._keyboardinputs;

public class PrintStatements {
    public static void main(String[] args) {
        System.out.println("Regualr print with new line");
        System.out.print("Print with no new line. New line can be added \n");
        System.out.println("Print with expressions "+ 5 + " and " + (5 < 5));
        System.out.format("Print similar to C's Printf: %d %.2f\n", 25, 3.33f);
        System.out.printf("Or use printf: %c\n", 'X');
    }
}
