package com.example.officelibrary.service;

import com.example.officelibrary.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    void create(Author author);
    List<Author> findAll();
    Optional<Author> findById(long authorid);
    Author read(long authorid);
    boolean update(Author author, long authorid);
    boolean delete(long authorid);
}
