package com.mycompany._iterativestatements;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input max: ");
        int max = sc.nextInt();
        
        System.out.println("\n--- Square ---");
        for(int i=0; i<max; i++){ // Outer
            for(int j=0; j<max; j++){ // Inner
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n--- Triangle ---");
        for(int i=0; i<max; i++){
            int j=0;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            for(j=i; j<max; j++)
                System.out.print("*");
            System.out.println();
        }
        
    }
}
