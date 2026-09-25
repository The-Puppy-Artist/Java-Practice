package com.mycompany._conditionalstatements;

import java.util.Scanner;

public class SwitchStement {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int input;
        
        System.out.print("Input 1: ");
        input = sc.nextInt();
        switch(input){
            case 48: System.out.println("ASCII 0"); break;
            case 49: System.out.println("ASCII 1"); break;
            case 50: System.out.println("ASCII 2"); break;
            case 51: System.out.println("ASCII 3"); break;
            case 52: System.out.println("ASCII 4"); break;
            case 53: System.out.println("ASCII 5"); break;
            case 54: System.out.println("ASCII 6"); break;
            case 55: System.out.println("ASCII 7"); break;
            case 56: System.out.println("ASCII 8"); break;
            case 57: System.out.println("ASCII 9"); break;
            default:
                System.out.println("Other Symbol");
        }
        
        System.out.print("Input 2: ");
        input = sc.nextInt();
        switch(input){
            case 65: System.out.println("Letter A");
            case 97: System.out.println("Letter a"); break;
            case 66: System.out.println("Letter B");
            case 98: System.out.println("Letter b"); break;
            case 67: System.out.println("Letter B");
            case 99: System.out.println("Letter b"); break;
            default:
                System.out.println("Not ABC.");
        }
    }
}
