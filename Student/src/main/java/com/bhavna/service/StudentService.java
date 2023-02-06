package com.bhavna.service;

import java.util.List;
import com.bhavna.model.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> getAllStudents();

	Student updateStudent(Student student);

	void deleteStudent(int student_id);

	Student getStudentById(int student_id);

}
