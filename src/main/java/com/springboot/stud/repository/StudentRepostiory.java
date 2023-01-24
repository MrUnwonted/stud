package com.springboot.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.stud.entity.Student;

public interface StudentRepostiory extends JpaRepository<Student, Long> {

}
