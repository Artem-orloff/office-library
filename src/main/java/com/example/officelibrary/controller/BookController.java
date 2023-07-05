package com.example.officelibrary.controller;

//import com.example.officelibrary.configuration.MapperUtil;
//import com.example.officelibrary.dto.BookDto;
//import com.example.officelibrary.dto.UserDto;
import com.example.officelibrary.exception.ResourceNotFoundException;
import com.example.officelibrary.model.Author;
import com.example.officelibrary.model.Book;
import com.example.officelibrary.repository.BookRepository;
import com.example.officelibrary.model.Users;
import com.example.officelibrary.repository.BookRepository;
import com.example.officelibrary.service.BookService;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/office-library")
@NoArgsConstructor
@AllArgsConstructor
public class BookController {
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @GetMapping("/post")
//    public List<BookDto> findAll(){
//        List<Book> books = BookRepository.findAll();
//        return MapperUtil.convertList(books, this::convertToBookDto);
//    }
//
//    private BookDto convertToBookDto(Book book){
//        BookDto bookDto = modelMapper.map(book, BookDto.class);
//        bookDto.setUserDto(convertToBookDto(book.getUsers().getBook()));
//            return bookDto;
//    }
//
//    private UserDto convertToUsersDto(Users users){
//        return modelMapper.map(users, UserDto.class);
//    }

    @Autowired
    BookService bookService;

//    @JsonProperty("user")
//    UserDto userDto;

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