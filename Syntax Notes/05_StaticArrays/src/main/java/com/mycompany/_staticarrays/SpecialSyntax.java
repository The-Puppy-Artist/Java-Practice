package com.mycompany._staticarrays;

import java.util.Scanner;

public class SpecialSyntax {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input color: ");
        String input = sc.nextLine();
        
        switch(input){
            case "red": case "RED":
                System.out.println("ff0000");
                break;
            case "green": case "GREEN":
                System.out.println("00ff00");
                break;
            case "blue": case "BLUE":
                System.out.println("0000ff");
                break;
            default:
                System.out.println("Not Primary");
        }
        
        char cArray[] = input.toCharArray();
        System.out.print("Letters |");
        for(char c: cArray)
            System.out.printf("%c|",c);
        System.out.println();
    }
}
