package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {

    // Spring will inject this via the setter
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<String> listTitles() {
        return bookRepository.findAllTitles();
    }
}
