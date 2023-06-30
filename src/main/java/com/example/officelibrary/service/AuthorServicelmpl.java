package com.example.officelibrary.service;

import com.example.officelibrary.model.Author;
import com.example.officelibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServicelmpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void create(Author author){
        authorRepository.save(author);
    }

    @Override
    public List<Author> findAll(){
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(long authorid){
        return authorRepository.findById(authorid);
    }

    @Override
    public Author read(long authorid){
        return authorRepository.getOne(authorid);
    }

    @Override
    public boolean update(Author author, long authorid){
        if (authorRepository.existsById(authorid)){
            author.setId(authorid);
            authorRepository.save(author);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(long authorid){
        if (authorRepository.existsById(authorid)){
            authorRepository.deleteById(authorid);
            return true;
        }
        return false;
    }
}
