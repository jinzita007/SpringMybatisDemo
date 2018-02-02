package com.zyl.app.controller;

import com.zyl.app.domain.Book;
import com.zyl.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> findAll() {
        List<Book> books = bookService.findAll();
        return books;
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public Book findOne(@PathVariable("id") Long id) {
        Book books = bookService.findOne(id);
        return books;
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    public Book save(@ModelAttribute Book book) {
        bookService.save(book);
        return book;
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT)
    public Map<String, String> update(@PathVariable("id") Long id, @ModelAttribute Book book) {
        Map<String, String> results = new HashMap<String, String>();
        book.setId(id);
        bookService.update(book);

        return results;
    }

    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
       bookService.delete(id);
    }

}
