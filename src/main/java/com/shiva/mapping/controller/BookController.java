package com.shiva.mapping.controller;

import com.shiva.mapping.dto.BookDto;
import com.shiva.mapping.exception.RecordNotFound;
import com.shiva.mapping.model.Book;
import com.shiva.mapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody BookDto book) throws RecordNotFound {
        Book book =  bookService.addBook(book);
        return book;
    }

}
