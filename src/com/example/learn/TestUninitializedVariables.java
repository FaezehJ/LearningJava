package com.example.learn;

public class TestUninitializedVariables {

	public static void main(String[] args) {
		
		 int uninitializedLocalVariable; // Declaration without initialization
	        System.out.println(uninitializedLocalVariable); 
	        // Compiler error: Exception in thread "main" java.lang.Error: Unresolved compilation problem
	        
	     int carYearVariable // = 2015;
	        System.out.println(carYearVariable);
	        
           // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	 	   // Syntax error, insert ";" to complete BlockStatements
	        	    
	}
}

