package com.newer.service;

import java.util.List;

import com.newer.dao.StudentMapper;
import com.newer.pojo.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("StudentService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper dao;

	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
	@Override
	public int addStudent1(Student student) {

		return 	dao.addStudent1(student);
	}

	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
	@Override
	public int deleteStudent(int id) {

		return dao.deleteStudent(id);
	}

	@Override
	public List<Student> findAll() {
		return dao.findAll();
		
	}
}
