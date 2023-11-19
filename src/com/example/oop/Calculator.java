package com.example.oop;

public class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20); // Calls the first add method
        int sum2 = calc.add(10, 20, 30); // Calls the overloaded add method

        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
