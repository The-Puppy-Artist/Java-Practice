package com.mycompany._staticarrays;

public class PassingValues {
    
    public static void resetPair1(int num1, int num2){
        num1 = num2 = 0;
    }
    
    public static void resetPair2(int num[]){
        for(int i=0; i<num.length; i++)
            num[i] = 0;
    }
    
    public static void main(String[] args) {
        int val1 = 5, val2 = 5;
        
        System.out.println("--- --- Passing a primitive --- ---");
        System.out.printf("Before: %d %d\n", val1, val2);
        resetPair1(val1, val2);
        System.out.printf("After : %d %d\n", val1, val2);
        
        System.out.println("\n--- --- Passing an array --- ---");
        int mypair[] = {5,5};
        System.out.printf("Before: %d %d\n", mypair[0], mypair[1]);
        resetPair2(mypair);
        System.out.printf("After : %d %d\n", mypair[0], mypair[1]);
    }
}
