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
Quantum book store: Test passed - Book with ISBN 123 already exists
Quantum book store: Test passed - Outdated books removed
Quantum book store: Shipping the paper book to123 Street
Quantum book store: Test passed - Insufficient stock for book with ISBN 123
Quantum book store: Sending the ebook to user@email.com
Quantum book store: Test passed - Book with ISBN 202 is not for sale
Quantum book store: All tests completed successfully
