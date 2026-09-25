package com.mycompany._conditionalstatements;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int input;
        
        System.out.print("Input 1: ");
        input = sc.nextInt();
        
        // Simple If statement
        if(input==0)
            System.out.println("Value is zero");
        
        System.out.print("Input 2: ");
        input = sc.nextInt();
        
        // If-else statement
        if(input<0){
            System.out.print("Negative");
            System.out.println(" Number");
        }else{
            System.out.print("Non-Negative");
            System.out.println(" Number");
        }
        
        System.out.print("Input 3: ");
        input = sc.nextInt();
        
        // If-else ladder
        if(input<0)
            System.out.println("Negative");
        else if(input<10)
            System.out.println("From 0 to 9");
        else if(input<100)
            System.out.println("From 10 to 99");
        else if(input<1000)
            System.out.println("From 100 to 999");
        else
            System.out.println("Large Number!");
        
        
        sc.close();
    }
}
