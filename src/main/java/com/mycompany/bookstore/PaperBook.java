/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

/**
 *
 * @author hanaraouf
 */
// PaperBook class - has real stock and needs shipping
public class PaperBook extends Book {
    private int stock;

    public PaperBook(String ISBN, String title, int yearBookPublished, double price, String author,int stock) {
        super(ISBN, title, yearBookPublished, price, author);
        this.stock=stock;
    }
// Paper books can be sold
    @Override
    public boolean canBeSold() {
        return true;
    }
// Return how many books are in stock
    @Override
    public int availableQuantity() {
        return stock;
    }
// Reduce quantity if available, otherwise throw error
    @Override
    public void reduceQuantity(int Quantity) {
        if (stock<Quantity){
            throw new RuntimeException("Insufficient stock");
        }
        stock -= Quantity;
    }
// Simulate shipping the book
    @Override
    public void deliver(String email, String address, int quantity) {
        System.out.println("Quantum book store: Shipping the paper book to "+ address);
    }
    
}
