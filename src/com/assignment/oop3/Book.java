package com.assignment.oop3;


public class Book {

    String title;
    boolean borrowed;

    // Create a new Book
    public Book(String bookTitle) {
        // Implement this method
    	this.title = bookTitle;
        this.borrowed = false; // Initially, the book is not borrowed
    }
   
    // Mark the book as borrowed
    public void borrowed() {
        // Implement this method
    	this.borrowed = true;
    }
   
    // Mark the book as not borrowed
    public void returned() {
        // Implement this method
    	this.borrowed = false;
    }
   
    // Return true if the book is borrowed, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    	return this.borrowed;
    }
   
    // Return the title of the book
    public String getTitle() {
        // Implement this method
    	return this.title;
    }

    public static void main(String[] arguments) {
    	
        // Small test of the Book class
    	
        Book example = new Book("The Da Vinci Code");
        
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}

