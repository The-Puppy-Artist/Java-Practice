package com.mycompany._conditionalstatements;

import java.util.Scanner;

public class SpecialSyntax {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int input;
        
        System.out.print("Input: ");
        input = sc.nextInt();
        
        input = (input%2==1)? 1:0;
        System.out.println("Value is "+input);
    }
}
