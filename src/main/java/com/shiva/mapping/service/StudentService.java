package com.shiva.mapping.service;

import com.shiva.mapping.model.Student;
import com.shiva.mapping.repository.StudentRepository;
import jdk.internal.icu.impl.UCharacterProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student) {
        Student  student = new Student();

        String ID = UUID.randomUUID().toString();


        student.setID(ID);
        student.setAge(studentDto.getAge());
        student.setName(studentDto.getName());
        student.setBranch(studentDto.getBranch());
        student.setDepartment(studentDto.getDepartment());
        student.setPhoneNumber(studentDto.getPhoneNumber());
        student.setAddress(studentDto.getAddress());
        Student student = studentRepo.save(student);
        return student;
    }
    }
}
