package com.example.library;

public class BookService {
    private BookRepository bookRepository;
    private String category;

    // Constructor injection
    public BookService(String category) {
        this.category = category;
        System.out.println("Constructor Injection - Category: " + category);
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection - BookRepository set.");
    }

    public void addBook(String title) {
        System.out.println("Adding book in category: " + category);
        bookRepository.saveBook(title);
    }
}
