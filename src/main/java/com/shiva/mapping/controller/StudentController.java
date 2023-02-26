package com.shiva.mapping.controller;

import com.shiva.mapping.dto.StudentDto;
import com.shiva.mapping.exception.RecordNotFound;
import com.shiva.mapping.model.Student;
import com.shiva.mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody StudentDto student){
        Student student =  studentService.addStudent(student);
        return student;
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable String studentId) throws RecordNotFound {
        Student student  = studentService.findByStudent(studentId);
        return student;
    }


    @GetMapping
    public List<Student> getAllStudent(){
        List<Student> allStudent = studentService.findAllStudent();
        return allStudent;
    }
}
