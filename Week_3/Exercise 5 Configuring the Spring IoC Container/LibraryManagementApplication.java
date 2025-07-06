package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean and test
        BookService service = context.getBean("bookService", BookService.class);
        service.addBook("Wings of Fire");
    }
}
