package com.mycompany._staticarrays;

public class MyStrings {
    public static void main(String[] args) {
        // String declaration
        String myStr1 = "Hello World";
        String myStr2 = new String();
        
        // String assignment
        myStr2 = "New Value";
        
        // String print statements
        System.out.println(myStr1);
        System.out.printf("Second: %s\n", myStr2);
        
        // String properties
        System.out.printf("First Letter: %c\n", myStr1.charAt(0));
        System.out.printf("String length: %d\n", myStr1.length());
        
        // Array of Strings
        int day = 25;
        int month = 12;
        int year = 2000;
        String monthInWords[] = {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };
        System.out.printf("%s %d, %d", 
                monthInWords[month-1], day, year);
    }
}
