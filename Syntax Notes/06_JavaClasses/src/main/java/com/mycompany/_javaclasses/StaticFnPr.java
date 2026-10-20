package com.mycompany._javaclasses;

import java.util.Scanner;

public class StaticFnPr {
    public static int makePrompt(){
        int input;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Input : ");
            input = sc.nextInt();
            sc.close();
        }catch(Exception e){
            input = -1;
        }
        return input;
    }
    
    public static void main(String[] args){
        // Accessing User defined Static Functions
        int input = StaticFnPr.makePrompt();
        
        // Accessing Static Attributes
        double myPi = Math.PI;
        
        // Accessing Static Functions
        input = Math.abs(input);
        
        double solution = myPi * input;
        System.out.printf("Answer: %.2f", solution);
    }
}
