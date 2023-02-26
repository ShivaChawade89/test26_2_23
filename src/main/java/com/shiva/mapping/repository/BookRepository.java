package com.shiva.mapping.repository;

import com.shiva.mapping.model.Book;
import com.shiva.mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,String> {
    List<Book> findAllBooByStudent(Student student);
}
