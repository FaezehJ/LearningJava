package com.example.oop;

public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
