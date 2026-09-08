package com.mycompany._javasyntax;


public class Expressions {
    public static void main(String[] args) {
        // arithmetic operators
        int add         = 1 + 1;
        int subtract    = 3 - 5;
        int divide      = 5/2;
        int modulo      = 5 % 2;
        int multiply    = 3 * 4;
        
        // comparison operators
        boolean equal               = 1 == 1;
        boolean notEq               = add != add;
        boolean lessThan            = 3 < 3;
        boolean lessThenOrEqual     = subtract <= multiply;
        boolean greaterThan         = divide > modulo;
        
        // logical operators
        boolean and     = equal && notEq;
        boolean or      = lessThan || lessThenOrEqual;
        boolean not     = !greaterThan;
        boolean par     = and && (or || not);
        System.out.println("First: " + par);
        
        // operator precedence
        boolean expression1 = 5 * 4 + 3 % 2 < 21; 
        System.out.println("Result1: " + expression1);
        
        boolean expression2 = 5==5 && 7 < 9 || 5 + 5 != 9 + 1; 
        System.out.println("Result2: " + expression2);
        
        boolean expression3 = ! true || true && 4 != 4; 
        System.out.println("Result3: " + expression3);
    }
}
