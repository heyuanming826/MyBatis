package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.pojo.Student;

/*
 * 操作数据库Student表的方法类
 */
public interface StudentMapper {
	
	//向学生表插入数据
	@Insert("insert into student values(null,#{name},#{phone},#{clazz.clazzid})")
	int addStudent(Student student);
	
	//删除学生表数据
	@Delete("delete from student where id=#{stuid}")
	int deleteStudent(@Param("stuid") int stuid);
	
	//查找所有学生表数据
	@Results(value= {@Result(id=true,property="stuid",column="id"),
			@Result(property="name",column="name"),
			@Result(property="phone",column="phone"),
			@Result(property="clazz",column="clazz_id",
			javaType=com.newer.pojo.Clazz.class,
			one=@One(select="com.newer.dao.ClazzMapper.findById"))})
	@Select("select * from student")
	List<Student> findAll();
	
	
}
