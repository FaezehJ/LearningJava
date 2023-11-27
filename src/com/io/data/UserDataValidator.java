package com.io.data;



public class UserDataValidator {

    private static String errorMessage = "";

    public static boolean isValid(String userData) {
        
        errorMessage = "";

        String[] parts = userData.split(",\\s*");
        if (parts.length != 3) {
            errorMessage = "Missing data";
            return false;
        }

        String name = parts[0];
        String email = parts[1].trim(); // To remove whitespace
        String ageStr = parts[2];

        if (!isValidName(name)) {
            errorMessage = "Invalid name";
            return false;
        }

        if (!isValidEmail(email)) {
            errorMessage = "Missing data";
            return false;
        }

        if (!isValidAge(ageStr)) {
        	errorMessage = "Invalid age format";    
            return false;
        }

        return true;
    }

    private static boolean isValidName(String name) {
        
        return !name.isEmpty();
    }

    private static boolean isValidEmail(String email) {
        
        return !email.isEmpty();
        
    }

    private static boolean isValidAge(String ageStr) {
    	
        try {
            int age = Integer.parseInt(ageStr);
            if (age <= 0) {
                errorMessage = "Age must be bigger than zero";
                return false;
            }
            return true;
            
        } catch (NumberFormatException e) {
            errorMessage = "Invalid age format";
            return false;
        }
    }

    public static String getErrorMessage() {
        return errorMessage;
    }
    
}


