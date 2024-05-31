package com.BookLibrary.book.controller;


import com.BookLibrary.book.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookRepo bookRepo;

    public void getAllBooks() {

    }

    public void getBooksById() {
    }

    public void addBook(){}

    public void updateBookById(){}

    public void deleteBookById(){}
}
