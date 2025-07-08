# Quantum Bookstore

**Fawry N2 Dev Slope Challenge #10 – Java OOP Project**

This project simulates an online bookstore system with three types of books: PaperBooks, EBooks, and ShowcaseBooks. It allows basic operations like adding, buying, and removing outdated books.

All system messages follow the format:  
 `Quantum book store: ...`

---

## Features

### Book Types
- **PaperBook**  
  - Has stock
  - Can be purchased
  - Delivered to a physical address (simulated with print)

- **EBook**  
  - Has filetype (e.g. PDF, EPUB)
  - Unlimited stock
  - Delivered to email (simulated with print)

- **ShowcaseBook**  
  - Not for sale
  - Only displayed in the store

---

## Functionalities

- **Add Book** to inventory  
  Duplicate ISBNs are not allowed.

- **Buy Book** by providing:
  - ISBN
  - Quantity
  - Email (for EBooks)
  - Address (for PaperBooks)
  - Auto-reduces stock and handles delivery simulation

- **Remove Outdated Books**  
  Removes books older than a given threshold (e.g., 10 years)

---

## Test Coverage

Tested in the `QuantumBookstoreFullTest` class:
- ✅ Adding books and checking for duplicate ISBNs
- ✅ Removing outdated books
- ✅ Buying PaperBooks (valid and invalid cases)
- ✅ Buying EBooks (large quantity)
- ✅ Trying to buy ShowcaseBooks (throws error)

---

## Extensibility
The system is fully OOP and designed to support new book types in the future without modifying the BookStore logic. All book behaviors are encapsulated using polymorphism.

---

## Sample Output
<img width="638" alt="Screenshot 2025-07-08 at 9 45 39 PM" src="https://github.com/user-attachments/assets/0cb3a7bf-0d62-4450-9805-b8e05dcaceab" />



