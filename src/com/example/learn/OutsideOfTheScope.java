package com.example.learn;

public class OutsideOfTheScope {

    public void methodA() {
    	
        int localVar = 10; // Local variable declared and initialized in methodA
        
        System.out.println("Value inside methodA: " + localVar); // This will print the value 10
    }

    public void methodB() {
    	
        // System.out.println("Trying to access localVar in methodB: " + localVar);
        // This will cause a compiler error because localVar is outside of the scope here.
    }

    public static void main(String[] args) {
    	
        OutsideOfTheScope example = new OutsideOfTheScope();
        
        example.methodA(); // This will work and print the value of localVar within methodA
        example.methodB(); // localVar is not accessible here, the line trying to print it is commented out to avoid a compilation error
    }
}

