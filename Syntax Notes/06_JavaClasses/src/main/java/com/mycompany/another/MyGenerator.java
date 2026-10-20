package com.mycompany.another;
import java.util.Random;

public class MyGenerator {
    // private means only this class can access
    private static final Random RAND_GEN 
            = new Random();
    
    // public means all classes can access
    public static int generateRandBetween(
            int low, int high){
        int gap = high-low;
        return low + RAND_GEN.nextInt(gap);
    }
}
