

package com.assignment.oop2;


public class MobilePhone {
	
 // Variables
	
    private String brand;
    private String model;
    private String phoneNumber;
    private int storageCapacity; 

 // Constructor
    
    public MobilePhone(String brand, String model, String phoneNumber, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.storageCapacity = storageCapacity;
    }

 // Getters and setters for each field
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    
 //  method for making a call
    
    public void makeCall(String phoneNumberToCall) {
     System.out.println("I am calling " + phoneNumberToCall + " from my " + brand + " " + model + " phone.");
    }
    
 //  method for installing an app
    
    public void installApp(String appName) {
        System.out.println("Installing " + appName + " on my " + brand + " " + model + " phone.");
    }
    
    
 // New method to display phone information
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
    
 // toString() method 
    
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' + ", model='" + model + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", storageCapacity=" + storageCapacity + '}';
    }

}
