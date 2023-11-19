package com.assignment.oop1;


public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    // Empty Constructor
    public Pet() {
    }

    // Constructor with all attributes
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Get and Set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // printing
    public static void main(String[] args) {
        Pet myPet = new Pet();

        myPet.setName("Hami");
        myPet.setAge(1);
        myPet.setLocation("New York");
        myPet.setType("Hampster");

        System.out.println("Name: " + myPet.getName());
        System.out.println("Age: " + myPet.getAge());
        System.out.println("Location: " + myPet.getLocation());
        System.out.println("Type: " + myPet.getType());
    }
}

