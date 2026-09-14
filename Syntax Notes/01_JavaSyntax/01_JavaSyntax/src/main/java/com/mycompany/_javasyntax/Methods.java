package com.mycompany._javasyntax;

public class Methods {
    public static void printStatement(){
        System.out.println("Hello. This is a function with no parameters");
        System.out.println("and return value.");
    }
    
    /***
     * This is an add function
     * @param num1 first number to be added
     * @param num2 second number to be added
     * @return result of the sum
     */
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        printStatement();
        int num = add (5, 10); 
        System.out.println("Result: " + (add(1,2)+num));
    }
}
