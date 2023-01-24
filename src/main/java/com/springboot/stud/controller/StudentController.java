package com.springboot.stud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.studservice.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handler method to handle list student and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}

}