package com.example.library.controller;

import com.example.library.exception.ResourceNotFoundException;
import com.example.library.model.Author;
import com.example.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/library")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/author")
    public ResponseEntity<?> getAllAuthors() {
        List<Author> authors = authorService.findAll();
        return ResponseEntity.ok().body(authors);
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<Optional<Author>> getAuthorById(@PathVariable(value = "id") Long authorId)
            throws ResourceNotFoundException {
        Optional<Author> authors = authorService.findById(authorId);
        return ResponseEntity.ok().body(authors);
    }

    @GetMapping("/author/add")
    public String authorAdd() {
        return "author-add";
    }
    @PostMapping("/author/add")
    public String authorPostAdd(@RequestParam String fullName, @RequestParam String birth,@RequestParam String biography, Model model) {
        Author author = new Author(fullName, birth, biography);
        authorService.create(author);
        return "redirect:/library/author";
    }


}
