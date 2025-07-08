/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookstore;

import java.util.List;

/**
 *
 * @author hanaraouf
 */
// This class tests everything required in the assignment
public class QuantumBookstoreFullTest {

    private BookStore store = new BookStore();
    private int currentYear = 2025;

    public void runTests() {
        testAddBook();
        testRemoveOutdatedBooks();
        testBuyPaperbook();
        testBuyEBook();
        testBuyShowcaseBook();
        System.out.println("Quantum book store: All tests completed successfully");
    }
// Test adding books and duplicate ISBN case
    private void testAddBook() {
        PaperBook book1 = new PaperBook("123", "Book1", 2020, 20.0, "Author1", 10);
        EBook book2 = new EBook("456", "Book2", 2023, 15.0, "Author2", "PDF");
        store.addBook(book1);
        store.addBook(book2);
        // Try to add a book with duplicate ISBN
        try {
            PaperBook book3 = new PaperBook("123", "Book3", 2021, 25.0, "Author3", 5);
            store.addBook(book3);
        } catch (RuntimeException e) {
            System.out.println("Quantum book store: Test passed - " + e.getMessage());
        }
    }
// Test removing outdated books
    private void testRemoveOutdatedBooks() {
        PaperBook oldBook = new PaperBook("789", "OldBook", 2010, 10.0, "OldAuthor", 3);
        store.addBook(oldBook);

        List<Book> outdated = store.removeOutdatedBooks(currentYear, 10);
        assert outdated.size() == 1 && outdated.get(0).getISBN().equals("789");
        System.out.println("Quantum book store: Test passed - Outdated books removed");
    }
// Test buying paper books and handling stock errors
    private void testBuyPaperbook() {
        double amount = store.buyBook("123", 2, "user@example.com", "123 Street");
        assert amount == 40.0;
// Try to buy more than available
        try {
            store.buyBook("123", 10, "user@example.com", "123 Street");
        } catch (RuntimeException e) {
            System.out.println("Quantum book store: Test passed - " + e.getMessage());
        }
    }
 // Test buying an ebook (unlimited quantity)
    private void testBuyEBook() {
        EBook ebook = new EBook("101", "EBook", 2024, 12.0, "EAuthor", "EPUB");
        store.addBook(ebook);

        double amount = store.buyBook("101", 100, "user@email.com", "");
        assert amount == 1200.0;
        System.out.println("Quantum book store: Test passed - EBook purchased");
    }
// Try buying a showcase book (should fail)
    private void testBuyShowcaseBook() {
        ShowcaseBook showcaseBook = new ShowcaseBook("202", "Showcase", 2025, 0.0, "ShowAuthor");
        store.addBook(showcaseBook);

        try {
            store.buyBook("202", 1, "any@email.com", "anywhere");
        } catch (RuntimeException e) {
            System.out.println("Quantum book store: Test passed - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        QuantumBookstoreFullTest testSuite = new QuantumBookstoreFullTest();
        testSuite.runTests();
    }
}
