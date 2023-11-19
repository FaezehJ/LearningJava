package com.example.oop;

public class Person {

    private String name; // Encapsulated field

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    // Main method for testing
    public static void main(String[] args) {
        Person person = new Person(); // Create a new Person object
        person.setName("John Doe"); // Set the name using setName method

        // Retrieve and print the name using getName method
        System.out.println("The person's name is: " + person.getName());
    }
}
