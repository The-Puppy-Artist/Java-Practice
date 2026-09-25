package com.mycompany._conditionalstatements;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int input;
        
        System.out.print("Input 1: ");
        input = sc.nextInt();
        
        // Nested if statement
        if(input>=0){
            if(input%2==0)
                System.out.println("Number is Even!");
            else
                System.out.println("Number is Odd!");
        }else{
            System.out.println("Number is negative...");
        }
        
        System.out.print("Input 2: ");
        input = sc.nextInt();
        
        if(input>99 && input <1000){
            int ones = input%10;
            int tens = input/10%10;
            int hund = input/10;
            if(ones==hund){
                System.out.println("Pallindrome");
                if(ones==tens)
                    System.out.println("All same digit");
            }
        }else{
            System.out.println("Number is not 3 digit");
            // the three variables are not accessible here
        }
        
    }
}
