package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.model.User;
import com.example.library.model.enums.Role;
import com.example.library.service.BookService;
import com.example.library.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/library")
public class UsersController {
    @Autowired
    UsersService usersService;
    @Autowired
    BookService bookService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers() {
        List<User> users = usersService.findAll();
        return ResponseEntity.ok().body(users);
    }
    @GetMapping("/{user_id}/take/{book_id}")
    public ResponseEntity<?> takeBook(@PathVariable(value = "user_id") Long userId, @PathVariable(value = "book_id") Long bookId) {

        User user = usersService.getById(userId);
        Book book = bookService.getById(bookId);
        if(user.getType() == Role.READER) {
            System.out.println("Correct");
        }
        else { System.out.println("Incorrect");}
        return ResponseEntity.ok().build();
    }

}