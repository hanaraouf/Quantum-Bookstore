/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author hanaraouf
 */
// Showcase books are just for display, not for sale
public class ShowcaseBook extends Book{

    public ShowcaseBook(String ISBN, String title, int yearBookPublished, double price, String author) {
        super(ISBN, title, yearBookPublished, price, author);
    }
// These books are never for sale
    @Override
    public boolean canBeSold() {
        return false;
    }

    @Override
    public int availableQuantity() {
        return 0;
    }

    @Override
    public void reduceQuantity(int Quantity) {
        throw new RuntimeException("Showcase books cannot be sold");
    }

    @Override
    public void deliver(String email, String address, int quantity) {
        throw new RuntimeException("Showcase books cannot be delivered");
    }
    
}
