package com.mycompany._javaclasses;

import java.util.Random;
import java.util.Scanner;

public class Instances {
    
    public static void main(String[] args) throws Exception{
        Random rand = new Random();
        System.out.println("Random: "+rand.nextInt(10));
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = sc.nextInt();
        System.out.println("Input: "+input);
        sc.close();
    }
    
}
