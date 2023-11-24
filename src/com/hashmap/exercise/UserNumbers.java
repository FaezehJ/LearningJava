package com.hashmap.exercise;

import java.util.ArrayList;
import java.util.Scanner;


public class UserNumbers {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Asking 5 numbers from the user
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        // variables for sum, product, largest, and smallest
        
        int sum = 0, product = 1, largest = numbers.get(0), smallest = numbers.get(0);

        // Calculating sum, product, largest, and smallest
        
        for (int number : numbers) {
            sum += number;
            product *= number;
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        } 

        // Printing the results
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
    }  
}
