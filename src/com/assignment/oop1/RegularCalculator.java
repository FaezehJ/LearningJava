package com.assignment.oop1;



public class RegularCalculator {

    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return num1 / num2;
    }

 // Method to return the square of the sum of num1 and num2
    
    public int squareOfSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum * sum; 
    }
    
  
    public static void main(String[] args) {
        RegularCalculator calculator = new RegularCalculator();

        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));
        System.out.println("Division: " + calculator.divide(10, 5));
        System.out.println("Division by zero: " + calculator.divide(10, 0)); 
        System.out.println("Square of Sum: " + calculator.squareOfSum(10, 5));
    }
}

	
