package com.example.officelibrary.controller;

import com.example.officelibrary.exception.ResourceNotFoundException;
//import com.example.officelibrary.model.Author;
import com.example.officelibrary.model.Book;
//import com.example.officelibrary.repository.BookRepository;
import com.example.officelibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/office-library")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks() {
        List<Book> books = bookService.findAll();
        return ResponseEntity.ok().body(books);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable(value = "id") Long bookId)
            throws ResourceNotFoundException {
        Optional<Book> books = bookService.findById(bookId);
        return ResponseEntity.ok().body(books);
    }

//    @GetMapping("/book/name/{name}")
//    public ResponseEntity<Optional<Book>> getBookByName(@PathVariable(value = "id") Long name)
//            throws ResourceNotFoundException {
//        Optional<Book> books = bookService.findByName(name);
//        return ResponseEntity.ok().body(books);
//    }
}