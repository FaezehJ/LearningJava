package com.index.arrays;


public class DoubleMaxIndex {
    public static void main(String[] args) {
    	
        // array
    	
        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        // Find the maximum value and its index
        
        int index = findMaxIndex(exampleArray);
        double maximum = exampleArray[index];

        // Print the maximum value and its index 
        
        System.out.println("Maximum value: " + maximum + ",\nIndex of the maximum value: " + index);
    }

    
    // Method to find the index of the maximum value in the array
    
    public static int findMaxIndex(double[] array) {
        double maximum = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
                index = i;
            }
        }

        return index;
    }
}