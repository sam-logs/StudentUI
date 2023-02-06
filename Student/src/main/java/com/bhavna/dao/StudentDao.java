package com.bhavna.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

	Student findById(int student_id);

}
