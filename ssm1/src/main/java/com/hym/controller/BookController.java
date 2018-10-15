package com.hym.controller;

import com.newer.pojo.Book;
import com.newer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public List<Book> findAll(){
        return bookService.findAll();
    }
}
