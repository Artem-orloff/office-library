package com.example.officelibrary.controller;

import com.example.officelibrary.model.Book;
import com.example.officelibrary.model.enums.Role;
import com.example.officelibrary.model.User;
import com.example.officelibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.officelibrary.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/library")
public class UsersController {
    @Autowired
    UserService userService;
    @Autowired
    BookService bookService;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
    @GetMapping("/{user_id}/take/{book_id}")
    public ResponseEntity<?> takeBook(@PathVariable(value = "user_id") Long userId, @PathVariable(value = "book_id") Long bookId) {
        User user = userService.getById(userId);
        Book book = bookService.getById(bookId);
        if(user.getType() == Role.READER) {
            System.out.println("Correct");
        }
        else { System.out.println("Incorrect");}
        return ResponseEntity.ok().build();
    }
}
