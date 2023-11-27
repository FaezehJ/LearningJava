package com.generics.lambdas;


public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters (optional, but good practice)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    
    public static void main(String[] args) {
        Inventory<Product> myInventory = new Inventory<>();

      
    // Adding products
        
        Product fridge = new Product("Refrigerator", 1200.0);
        Product microwave = new Product("Microwave", 150.0);
        Product washer = new Product("Washing Machine", 800.0);
        Product airFryer = new Product("Air Fryer", 200.0);
        Product tv = new Product("TV", 2000.0);
        
        
        myInventory.addItem(fridge);
        myInventory.addItem(microwave);
        myInventory.addItem(washer);
        myInventory.addItem(airFryer);
        myInventory.addItem(tv);
        

     // Printing out product names and total count
        
        System.out.println("Total number of products in inventory: " + myInventory.getItemCount());
        for (Product product : myInventory.getItems()) {
            System.out.println("Product Name: " + product.getName());
        }
      // Remove an item
        
        myInventory.removeItem(tv);
        
        System.out.println("Products in Inventory after removal:");
        for (Product product : myInventory.getItems()) {
            System.out.println("Product Name: " + product.getName());
        }

        // Print the number of items in the inventory after removal
        System.out.println("Total number of products in inventory after removal: " + myInventory.getItemCount());

        
      // Calculates total price
        
        double priceTotal = myInventory.getItems().stream()
            .mapToDouble(Product::getPrice)
            .sum();

       
        for (Product p : myInventory.getItems()) {
        	
            System.out.println(p.getName() + " - " + p.getPrice());
        }
        
        // Print total price 
        
        System.out.println("Total Price: " + priceTotal);
        
        
    }
    
}
