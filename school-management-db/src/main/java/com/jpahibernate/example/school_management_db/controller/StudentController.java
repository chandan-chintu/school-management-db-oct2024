package com.jpahibernate.example.school_management_db.controller;

import com.jpahibernate.example.school_management_db.model.Student;
import com.jpahibernate.example.school_management_db.repository.StudentRepository;
import com.jpahibernate.example.school_management_db.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student/api")
public class StudentController {

    // controller<->service<->repository

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String addStudent(@RequestBody Student student){
        String response = studentService.saveStudent(student);
        return response;
    }

    @PostMapping("/saveMany")
    public String addStudents(@RequestBody List<Student> studentList){
        String response = studentService.saveStudents(studentList);
        return response;
    }

}
