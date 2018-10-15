package com.newer.test;

import com.newer.pojo.Book;
import com.newer.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1()

    {


    ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");

    BookService service = cxt.getBean("bookService", BookService.class);
    Book book = service.findById(1);
        System.out.println(book.getTitle());
}
}
