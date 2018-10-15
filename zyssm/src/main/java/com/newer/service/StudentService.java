package com.newer.service;

import java.util.List;

import com.newer.pojo.Student;
import org.apache.ibatis.annotations.Param;


public interface StudentService {
	//添加
	int addStudent1(Student student);
	
	//删除
	int deleteStudent(@Param("id") int id);
	
	//查所有
	List<Student> findAll();
	
}
