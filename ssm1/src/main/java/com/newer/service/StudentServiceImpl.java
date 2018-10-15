package com.newer.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.newer.pojo.Student;
import com.newer.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shining
 *
 */
@Service("studentService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> findAll() {
		return studentMapper.findAll();
	}
	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
	@Override
	public int addStudent(Student student) {
		return studentMapper.addStudent(student);
	}

	@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
	@Override
	public int deleteStudent(int stuid) {
		return studentMapper.deleteStudent(stuid);
	}
	

}
