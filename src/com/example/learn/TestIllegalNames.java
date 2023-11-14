package com.example.learn;


public class TestIllegalNames {
    // Valid field name
    int aValidName; 

 // Incorrect field names 
    // int 1invalid;       // Error: Cannot start with a digit
    // int class;          // Error: Cannot use a Java reserved word
    // int my-field;       // Error: Cannot use a hyphen in names
    // int *$anotherInvalid; // Error: Asterisks are not allowed in names
    // int .dotStart;      // Error: Periods are not valid in names

    public static void main(String[] args) {
       
        System.out.println("Test Illegal Names");
    }
}