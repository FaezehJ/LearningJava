package com.example.oop;

public class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public static void main(String[] args) {
        Drawable drawable = new Rectangle(); // Polymorphic behavior
        drawable.draw(); // Calls the draw method of Rectangle
    }
}
