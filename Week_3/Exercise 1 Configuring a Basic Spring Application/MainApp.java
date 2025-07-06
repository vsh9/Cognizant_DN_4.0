package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // 1️⃣ Bootstraps Spring using the XML we created
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2️⃣ Ask Spring for the ready‑wired service
        BookService service = ctx.getBean("bookService", BookService.class);

        // 3️⃣ Use it
        service.listTitles().forEach(System.out::println);

        // optional—but good practice
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
