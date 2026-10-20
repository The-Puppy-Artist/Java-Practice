package com.mycompany._javaclasses;

public class BasicClass {
    
    private float first, second;
    
    public BasicClass(float firstVal, float secondVal){
        first = firstVal;
        second = secondVal;
    }
    
    public float exclusiveAdd(){
        return first + second;
    }
    
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        int sum1 = add(5,6);
        BasicClass bc = new BasicClass(2.5f, 3.5f);
        float sum2 = bc.exclusiveAdd();
        System.out.printf("Sum1: %d\nSum2: %.2f\n", sum1, sum2);
    }
}
