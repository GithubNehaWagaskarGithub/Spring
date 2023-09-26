package com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Service;

import com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Model.Book;
import com.SpringApp3WithSpringSecurity.SpringApp3WithSpringSecurity.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> displayData()
    {
        return repository.findAll();
    }
    //----------------------------------





}
