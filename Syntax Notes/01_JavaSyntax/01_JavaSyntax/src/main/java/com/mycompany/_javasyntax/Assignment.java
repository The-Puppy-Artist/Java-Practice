package com.mycompany._javasyntax;

public class Assignment {
    public static void main(String[] args) {
        // variables can be declared with an initial value
        int myNumber1 = 1;
        // variables can be declared without an initial value
        // note: java wont let an initialized variable be printed
        int myNumber2;
        
        // assignment changes the value of a variable
        System.out.println("Before : " + myNumber1);
        myNumber1 = 5;
        myNumber2 = 9; 
        System.out.println("After  : " + myNumber1 + ":" +myNumber2);
        
        // other ways to assign values
        myNumber1++;
        myNumber2 *= 2;
        System.out.println("Adjust : " + myNumber1 + ":" +myNumber2);
    }
}
