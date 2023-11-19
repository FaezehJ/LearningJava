package com.assignment.oop1;


public class MagicCalculator extends RegularCalculator {

    // Method to return the square root of a number
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // Method to return the sine of a number 
    public double sine(double radians) {
        return Math.sin(radians);
    }

    // Method to return the cosine of a number 
    public double cosine(double radians) {
        return Math.cos(radians);
    }

    // Method to return the tangent of a number 
    public double tangent(double radians) {
        return Math.tan(radians);
    }

    // Method to return the factorial of a number
    public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    
    public static void main(String[] args) {
        MagicCalculator magicCalculator = new MagicCalculator();

        // Testing inherited methods from RegularCalculator
        System.out.println("Addition: " + magicCalculator.add(10, 5));
        System.out.println("Subtraction: " + magicCalculator.subtract(10, 5));
        System.out.println("Multiplication: " + magicCalculator.multiply(10, 5));
        System.out.println("Division: " + magicCalculator.divide(10, 5));
        System.out.println("Square of Sum: " + magicCalculator.squareOfSum(10, 5));


        System.out.println("Square Root of 16: " + magicCalculator.squareRoot(16));
        System.out.println("Sine of PI/2 radians: " + magicCalculator.sine(Math.PI / 2));
        System.out.println("Cosine of PI/2 radians: " + magicCalculator.cosine(Math.PI / 2));
        System.out.println("Tangent of PI/4 radians: " + magicCalculator.tangent(Math.PI / 4));
        System.out.println("Factorial of 5: " + magicCalculator.factorial(5));
        
    }
}

