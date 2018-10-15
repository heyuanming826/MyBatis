package com.newer.service;

import java.util.List;

import com.newer.pojo.Student;


public interface StudentService {
	
	List<Student> findAll();
	
	int addStudent(Student student);
	
	int deleteStudent(int stuid);

}
