package com.mycompany._javasyntax;

public class Variables {
    public static void main(String[] args) {
        // integer data types
        byte tiny     = 25;
        short small   = 2030;
        int medium    = 192168;
        long large    = 19216812701L;

        // float data types
        float decimal = 32.32f;
        double bigDec = 1024.1024;

        // character data type
        // values can be letters, numbers and symbols
        char myLetter = 'X';

        // boolean type
        boolean myBool = true; // or false

        // string type
        String myStr1 = "Small";
        String myStr2 = "Dec ";
        
        // Display using println
        System.out.println("Tiny  : " + tiny);
        System.out.print  (myStr1 +" : " + small + "\n");
        System.out.println("Medium: " + medium + "\nLarge : " + large);
        
        // Display using printf
        System.out.printf ("%sMD: %f\n", myStr2, decimal);
        System.out.printf ("%sBG: %09.2f\n", myStr2, bigDec);
        
        // Display comparison
        System.out.printf ("Letter: %c\n", myLetter);
        System.out.println("Bool  : " + myBool);
    }
}
