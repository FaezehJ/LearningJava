package com.index.arrays;


public class ArraySum {
    public static void main(String[] args) {
    	
        // Array
    	
        int[] array = {11, 2, 3, 4, 5};

        // Call the method to sum the values
        
        int sum = sumArray(array);

        // Print the result
        System.out.println("Sum of array values: " + sum);
    }

    // Method to sum all values in the array
    
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
