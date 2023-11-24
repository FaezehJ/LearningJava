package com.assignment.oop3;

import java.util.ArrayList;

public class Library {
    private String address;
    private ArrayList<Book> books;

    public Library(String address) {
        this.address = address;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9 am to 5 pm.");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.isBorrowed()) {
                    book.borrowed();
                    System.out.println("You successfully borrowed " + title);
                    return;
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isBorrowed()) {
                book.returned();
                System.out.println("You successfully returned " + title);
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void printAvailableBooks() {
        boolean found = false;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book in catalog.");
        }
    }

    // Main method 

    public static void main(String[] args) {
    	
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 
