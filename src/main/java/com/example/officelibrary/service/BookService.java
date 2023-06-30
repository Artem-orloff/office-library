package com.example.officelibrary.service;

import com.example.officelibrary.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void create(Book book);
    List<Book> findAll();
    Optional<Book> findById(long bookid);
//    Optional<Book> findByName(long name);
    Book read(long bookid);
    boolean update(Book book, long bookid);
    boolean delete(long bookid);
}
