package com.index.arrays;

import java.util.Arrays;


public class PowerArray {
    public static void main(String[] args) {
        
        int size = 4;
        int power = 2;
        int[] result = toPower(size, power);

        
        System.out.println(Arrays.toString(result));
    }

    // Power method to create the array (the square of each index)
    
    public static int[] toPower(int size, int power) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.pow(i, power);
        }

        return array;
    }
}
