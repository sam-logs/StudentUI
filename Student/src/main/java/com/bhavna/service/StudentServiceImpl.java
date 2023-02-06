package com.bhavna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.dao.StudentDao;
import com.bhavna.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		Student save = this.studentDao.save(student);
		return save;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> findAll = this.studentDao.findAll();
		return findAll;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
//		Student update = this.studentDao.findById(student.getStudent_id());
//		student.setStudent_id(student.getStudent_id());
//		student.setStudent_name(student.getStudent_name());
//		student.setStudent_email(student.getStudent_email());
//		student.setStudent_branch(student.getStudent_branch());		
		return this.studentDao.save(student);
	}

	@Override
	public void deleteStudent(int student_id) {
		// TODO Auto-generated method stub

		Student delete = this.studentDao.findById(student_id);
		this.studentDao.delete(delete);

	}

	@Override
	public Student getStudentById(int student_id) {
		// TODO Auto-generated method stub
		Student findStudentById = this.studentDao.findById(student_id);
		return findStudentById;
	}

}
