
package com.example.oop;

public class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Shape shape = new Circle(); // Polymorphic behavior
        shape.draw(); // Calls the draw method of Circle
    }
}
