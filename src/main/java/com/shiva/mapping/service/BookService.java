package com.shiva.mapping.service;

import com.shiva.mapping.dto.BookDto;
import com.shiva.mapping.model.Book;
import com.shiva.mapping.model.Student;
import com.shiva.mapping.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository

    public Book addBook(BookDto bookDto) {
        Student byStudent = studentService.findByStudent(bookDto.getStudentID());
        Book book = new Book();
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        book.setStudent(byStudent);
        book.setDescription(book.getDescription());
        book.setID(ID);
        Book book = bookRepository.save(book);
        return book;
    }
}
