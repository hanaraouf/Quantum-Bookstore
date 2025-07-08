/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author hanaraouf
 */
// Abstract class Book - acts as a base class for all types of books
// It defines abstract methods that every book type must implement
public abstract class Book {
    // Book attributes
    protected String ISBN;
    protected String title;
    protected int yearBookPublished;
    protected double price;
    protected String author;
    // Constructor to initialize book details
    public Book(String ISBN,String title,int yearBookPublished,double price,String author){
        this.ISBN=ISBN;
        this.author=author;
        this.price=price;
        this.yearBookPublished=yearBookPublished;
        this.title=title;
    }
    // Getters for needed fields
    public String getISBN(){
        return ISBN;
    }
    
    public int getyear(){
        return yearBookPublished;
    }
    
    public double getPrice(){
        return price;
    }
    // Abstract methods that subclasses must implement
    public abstract boolean canBeSold();
    public abstract int availableQuantity();
    public abstract void reduceQuantity(int Quantity);
    public abstract void deliver(String email, String address, int quantity);
}
