package com.springboot.stud.service.impl;

import com.springboot.stud.entity.Student;
import com.springboot.stud.repository.StudentRepostiory;
import com.springboot.stud.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepostiory studentRepostiory;

    public StudentServiceImpl(StudentRepostiory studentRepostiory) {
        this.studentRepostiory = studentRepostiory;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepostiory.findAll();
    }
}
