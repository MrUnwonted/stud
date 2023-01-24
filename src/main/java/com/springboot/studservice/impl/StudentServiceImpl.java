package com.springboot.studservice.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.springboot.stud.entity.Student;
import com.springboot.stud.repository.StudentRepostiory;
import com.springboot.studservice.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepostiory studentRepostiory;
	

	public StudentServiceImpl(StudentRepostiory studentRepostiory) {
		super();
		this.studentRepostiory = studentRepostiory;
	}



	@Override
	public List<Student> getAllStudents() {
		
		return studentRepostiory.findAll();
	}

}
