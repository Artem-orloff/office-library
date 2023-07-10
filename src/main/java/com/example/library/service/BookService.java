package com.example.library.service;

import com.example.library.model.Book;

import java.util.List;

public interface BookService {
    void create(Book book);
    List<Book> findAll();
    Book getById(Long book_id);
    Book read(long book_id);
    boolean update(Book book, long book_id);
    boolean delete(long book_id);

}
