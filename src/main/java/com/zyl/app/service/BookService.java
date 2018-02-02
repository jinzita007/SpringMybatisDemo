package com.zyl.app.service;

import com.zyl.app.domain.Book;
import com.zyl.app.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    @Transactional
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Transactional
    public Book findOne(Long id) {
        return bookMapper.findOne(id);
    }

    @Transactional
    public void save(Book book) {
        bookMapper.save(book);
    }

    @Transactional
    public void update(Book book) {
        bookMapper.update(book);
    }

    @Transactional
    public Long delete(Long id) {
        bookMapper.delete(id);
        return id;
    }
}
