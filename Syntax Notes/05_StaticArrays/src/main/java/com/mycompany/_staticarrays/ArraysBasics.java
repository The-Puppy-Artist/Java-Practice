package com.mycompany._staticarrays;

public class ArraysBasics {
    // Function using arrays
    public static float computeGrades(float percent[], int grades[]){
        float retVal = 0.0f;
        for(int i=0; i<percent.length && i<grades.length; i++){
            retVal += percent[i] * grades[i];
        }
        return retVal;
    }
    
    public static void main(String[] args) {
        // Arrays declaration
        float percent[] = new float[8];
        int grades[] = {50, 70, 80, 75, 80, 93, 72, 88};
        
        // Arrays accessing elements
        percent[0] = 0.10f;
        percent[1] = 0.10f;
        percent[2] = 0.10f;
        percent[3] = 0.10f;
        percent[4] = 0.10f;
        percent[5] = 0.15f;
        percent[6] = 0.15f;
        percent[7] = 0.20f;
        
        // Obtain the length of an array
        float sum = 0.0f;
        for(int i=0; i<grades.length; i++){
            sum += percent[i];
        }
        System.out.printf("Total Percent: %.2f\n",sum);
        
        // Passing an array in a function
        sum = computeGrades(percent, grades);
        System.out.printf("Total Grade: %.2f\n", sum); 
    }
}
