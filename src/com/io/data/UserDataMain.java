package com.io.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class UserDataMain {

    public static void main(String[] args) {
    	
        String userData = "userData.txt";
        String validOutput = "validoutput.txt";
        String errorOutput = "erroroutput.txt";
      

        try (BufferedReader reader = new BufferedReader(new FileReader(userData));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validOutput));
             BufferedWriter errorWriter = new BufferedWriter(new FileWriter(errorOutput))) {

            String line;
            
            while ((line = reader.readLine()) != null) {
                if (UserDataValidator.isValid(line)) {
                    validWriter.write(line + "\n");
                } else {
                    errorWriter.write(line + " - Error: " + UserDataValidator.getErrorMessage() + "\n");
                }
            }
            
        
            
        } catch (IOException e) {
        	
            e.printStackTrace();
        }
        
    }
}