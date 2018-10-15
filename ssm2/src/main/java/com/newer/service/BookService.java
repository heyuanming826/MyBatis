package com.newer.service;

import com.newer.pojo.Book;

import java.util.List;

/**
 * @author shining
 */
public interface BookService {

    int addBook(Book book);

    int deleteBook(int bookId);

    int updateBook(Book book);

    Book findById(int bookId);

    List<Book> findAll();

    List<Book> findAll2();
}
