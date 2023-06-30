package com.example.officelibrary.service;

import com.example.officelibrary.model.Author;
import com.example.officelibrary.model.Book;
import com.example.officelibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServicelmpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void create(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(long bookid){
        return bookRepository.findById(bookid);
    }

//    @Override
//    public Optional<Book> findByName(long name){
//        return bookRepository.findByName(name);
//    }

    @Override
    public Book read(long bookid){
        return bookRepository.getOne(bookid);
    }

    @Override
    public boolean update(Book book, long bookid){
        if (bookRepository.existsById(bookid)){
            book.setId(bookid);
            bookRepository.save(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(long bookid){
        if (bookRepository.existsById(bookid)){
            bookRepository.deleteById(bookid);
            return true;
        }
        return false;
    }
}
