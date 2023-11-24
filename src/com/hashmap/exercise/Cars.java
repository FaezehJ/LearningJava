package com.hashmap.exercise;

import java.util.HashMap;
import java.util.Scanner;


public class Cars {
    private HashMap<String, String> cars;

    public Cars() {
        cars = new HashMap<>();
    }

    public void addCar(String model, String make) {
        cars.put(model, make);
    }

    public String findCarByModel(String model) {
        return cars.getOrDefault(model, "Car not found");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cars cars = new Cars();

        // Adding cars 
        
        cars.addCar("Model 3", "Tesla");
        cars.addCar("Mustang", "Ford");
        cars.addCar("Civic", "Honda");

        // Asking the user 
        
        System.out.print("Enter the model of the car you are looking for: ");
        String model = scanner.nextLine();

        // Searching for the car
        
        String make = cars.findCarByModel(model);

        //  custom message
        if (!make.equals("Car not found")) {
            System.out.println("Oh, you're looking for a " + model + "? Our " + make + " selection is right over here.");
        } else {
            System.out.println("Sorry, we don't have that model.");
            
        }
        
        
    }
}
