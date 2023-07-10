package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/library")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public ResponseEntity<?> getAllBooks() {
        List<Book> books = bookService.findAll();
        return ResponseEntity.ok().body(books);
    }
}