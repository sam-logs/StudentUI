package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.model.Student;
import com.bhavna.service.StudentService;

@RestController(value = "/student")
@CrossOrigin(origins = "*")
public class Controller {

	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student stud = this.studentService.saveStudent(student);
		return new ResponseEntity<Student>(stud, HttpStatus.CREATED);
	}

	@GetMapping("/getAllUsers")
	public ResponseEntity<List<Student>> viewAllStudent() {
		return ResponseEntity.ok(this.studentService.getAllStudents());
	}

	@PutMapping("/update/{student_id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int student_id, @RequestBody Student student) {
		Student stud = this.studentService.updateStudent(student);
		return ResponseEntity.ok(stud);
	}

	@DeleteMapping("/delete/{student_id}")
	public void deleteStudent(@PathVariable int student_id) {
		this.studentService.deleteStudent(student_id);
	}

	@GetMapping("findUser/{student_id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int student_id) {
		return ResponseEntity.ok(this.studentService.getStudentById(student_id));
	}

}
