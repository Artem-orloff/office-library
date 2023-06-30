package com.example.officelibrary.controller;

import com.example.officelibrary.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.officelibrary.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/office-library")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public ResponseEntity<?> getAllBooks(){
        List<Book> books = bookService.findAll();
        return ResponseEntity.ok().body(books);
    }
}
