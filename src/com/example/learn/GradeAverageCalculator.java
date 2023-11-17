package com.example.learn;
import java.util.Scanner;
import java.util.ArrayList;


public class GradeAverageCalculator {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        
 //       boolean moreGrades = true;

 //       while (moreGrades) {
 //           System.out.print("Enter a grade (or a negative number to finish): ");
        
 //          double grade = scanner.nextDouble();
 //           if (grade < 0) {
 //               moreGrades = false;
 //           } else {
 //               grades.add(grade);
 //           }
 //       }

 //        double sum = 0;
 //       for (double grade : grades) {
 //           sum += grade;
 //      }

 //       double average = grades.isEmpty() ? 0 : sum / grades.size();
 //       System.out.println("The average grade is: " + average);
                
        String input;

        while (true) {
            double grade;
            while (true) {
                System.out.print("Enter a grade (0-100): ");
                grade = scanner.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    break; // Break the inner loop if grade is valid
                } else {
                    System.out.println("Invalid grade. Please enter a number between 0 and 100.");
                }
            }

            // Providing feedback based on the grade entered
            if (grade > 90) {
                System.out.println("Excellent Work!");
            } else if (grade > 80) {
                System.out.println("Good Job!");
            } else if (grade > 70) {
                System.out.println("Keep it up!");
            } else {
                System.out.println("Let's work hard to get those grades up!");
            }

            grades.add(grade);

            System.out.print("Do you want to enter another grade? (yes/no): ");
            input = scanner.next();

            if (input.equalsIgnoreCase("no")) {
                break; // Break the outer loop to end input
            }
        }

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }

        double average = grades.isEmpty() ? 0 : sum / grades.size();
        System.out.println("The average grade is: " + average);
    }
}


    
