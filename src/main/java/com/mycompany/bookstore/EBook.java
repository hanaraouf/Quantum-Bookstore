/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author hanaraouf
 */
// EBook class extends Book. EBooks don't have stock limits and are delivered via email.
public class EBook extends Book {
    private String filetype;

    public EBook(String ISBN, String title, int yearBookPublished, double price, String author,String filetype) {
        super(ISBN, title, yearBookPublished, price, author);
        this.filetype=filetype;
    }
// EBooks can always be sold
    @Override
    public boolean canBeSold() {
        return true;
    }
 // No stock limit for digital books
    @Override
    public int availableQuantity() {
        return Integer.MAX_VALUE;
    }
// No need to reduce anything because it's unlimited
     @Override
    public void reduceQuantity(int Quantity) {
        
    }
// Simulate email delivery
    @Override
    public void deliver(String email, String address, int quantity) {
        System.out.println("Quantum book store: Sending the ebook to " + email);
    }
    
}
