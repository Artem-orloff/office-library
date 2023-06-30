package com.example.officelibrary.service;

import com.example.officelibrary.model.Book;

import java.util.List;

public interface BookService {
    void create(Book book);
    List<Book> findAll();
    Book read(long bookid);
    boolean update(Book book, long bookid);
    boolean delete(long bookid);
}
