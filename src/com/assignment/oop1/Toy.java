package com.assignment.oop1;

public class Toy {
    
    private String name;
    private String type;
    private int price;
    
    // Empty Constructor
    public Toy() {
    }
    
    // Constructor with only two variables
    public Toy(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    // Constructor with all three attributes
    public Toy(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    // Get and Set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    // Method to check if the toy is safe
    public boolean isSafe() {
        // A toy is not safe if its type is "Recalled"
        return !type.equalsIgnoreCase("Recalled");
    }
    
    // Method to return a message 
    public String safeToy() {
        if (isSafe()) {
            return "Have fun playing with your new toy!";
        } else {
            return "This toy has a recall and it's not safe.";
        }
    }
    
    public static void main(String[] args) {
        Toy myToy = new Toy();

        myToy.setName("Cybertron");
        myToy.setType("Transformers");
        myToy.setPrice(64);
        

        System.out.println("Name: " + myToy.getName());
        System.out.println("Type: " + myToy.getType());
        System.out.println("Price: " + myToy.getPrice());
        System.out.println(myToy.safeToy()); 
    }
}
