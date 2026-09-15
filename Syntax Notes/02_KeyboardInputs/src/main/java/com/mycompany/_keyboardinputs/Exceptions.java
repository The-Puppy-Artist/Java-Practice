package com.mycompany._keyboardinputs;

public class Exceptions {
    public static int addStringsOfNumbers(String str1, String str2) 
            throws Exception{
        int val1 = Integer.parseInt(str1);
        int val2 = Integer.parseInt(str2);
        return val1 + val2;
    }
    
    public static void main(String[] args) {
        int value;
        try{
            value = addStringsOfNumbers("1", "two");
        }catch(Exception e){
            System.out.println("Exception occured!");
            value = -1;
        }
        System.out.println("Result is "+ value);
    }
}
