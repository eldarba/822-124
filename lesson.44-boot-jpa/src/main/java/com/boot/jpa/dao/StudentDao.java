package com.boot.jpa.dao;

import java.util.List;

import com.boot.jpa.entities.Student;

public interface StudentDao {

	int addStudent(Student student);

	Student getStudent(int studentId);

	List<Student> getAllStudents();

	boolean updateStudent(Student student);

	boolean deleteStudent(int studentId);

}
