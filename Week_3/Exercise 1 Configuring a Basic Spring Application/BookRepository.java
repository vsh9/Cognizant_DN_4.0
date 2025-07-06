package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    // pretend this comes from a database
    public List<String> findAllTitles() {
        return Arrays.asList(
                "The Pragmatic Programmer",
                "Clean Code",
                "Introduction to Algorithms");
    }
}
