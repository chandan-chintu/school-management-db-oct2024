package com.jpahibernate.example.school_management_db.service;

import com.jpahibernate.example.school_management_db.model.Student;
import com.jpahibernate.example.school_management_db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // it contains business logic
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String saveStudent(Student student){
        studentRepository.save(student);
        return "Student saved successfully";
    }

    public String saveStudents(List<Student> studentList){
        studentRepository.saveAll(studentList);
        return "Students saved successfully";
    }
}
