package com.example.oop;

public class Parrot extends Bird {
    @Override
    public void sing() {
        System.out.println("Parrot is singing");
    }

    public static void main(String[] args) {
        Bird bird = new Bird(); // Create a Bird instance
        bird.sing(); // Calls sing method of Bird

        Bird parrot = new Parrot(); // Bird reference but Parrot object
        parrot.sing(); // Calls overridden sing method in Parrot

        
    }
}
