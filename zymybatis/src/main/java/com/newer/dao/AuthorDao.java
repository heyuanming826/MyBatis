package com.newer.dao;

import com.newer.bean.Author;

import java.util.List;

public interface AuthorDao {
    List<Author> finyAll();

    Author author(int id);

    int deleteAuthor(int id);

    int addAuthor(Author author);

    int updateAuthor(Author author);

}
