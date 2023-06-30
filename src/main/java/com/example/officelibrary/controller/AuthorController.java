package com.example.officelibrary.controller;


import com.example.officelibrary.exception.ResourceNotFoundException;
import com.example.officelibrary.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.officelibrary.service.AuthorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/office-library")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/author")
    public ResponseEntity<?> getAllAuthors(){
        List<Author> authors = authorService.findAll();
        return ResponseEntity.ok().body(authors);
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<Optional<Author>> getAuthorById(@PathVariable(value = "id") Long authorId)
        throws ResourceNotFoundException {
        Optional<Author> authors = authorService.findById(authorId);
        return ResponseEntity.ok().body(authors);
    }
}
