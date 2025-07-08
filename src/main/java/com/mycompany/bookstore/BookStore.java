/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanaraouf
 */
// This class represents the store. It manages the inventory of books and operations like add, remove, buy.
public class BookStore {
    private List<Book> inventory = new ArrayList<>();
    // Adds a book if the ISBN is unique
    public void addBook(Book book) {
        for (Book b : inventory) {
            if (b.ISBN.equals(book.ISBN)) {
                throw new RuntimeException("Book with ISBN " + book.ISBN + " already exists");
            }
        }
        inventory.add(book);
    }
    // Removes books that are older than a given number of years
    public List<Book> removeOutdatedBooks(int currentYear, int thresholdYears) {
        List<Book> outdatedBooks = new ArrayList<>();
        List<Book> remainingBooks = new ArrayList<>();
        
        for (Book book : inventory) {
            if (currentYear - book.yearBookPublished >= thresholdYears) {
                outdatedBooks.add(book);
            } else {
                remainingBooks.add(book);
            }
        }
        
        inventory = remainingBooks;
        return outdatedBooks;
    }
    // Buys a book using ISBN, handles stock and delivery
    public double buyBook(String isbn, int quantity, String email, String address) {
        Book target = findBookByIsbn(isbn);
        
        if (target == null) {
            throw new RuntimeException("Book with ISBN " + isbn + " not found");
        }
        if (!target.canBeSold()) {
            throw new RuntimeException("Book with ISBN " + isbn + " is not for sale");
        }
        if (target.availableQuantity() < quantity) {
            throw new RuntimeException("Insufficient stock for book with ISBN " + isbn);
        }
        // Reduce stock and deliver
        target.reduceQuantity(quantity);
        target.deliver(email, address,quantity);
        return target.price * quantity;
    }
    
    private Book findBookByIsbn(String isbn) {
        for (Book book : inventory) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
